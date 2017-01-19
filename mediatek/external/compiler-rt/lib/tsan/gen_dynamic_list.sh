#!/bin/bash
set -e

# Collect interceptor names from a source file.
function collect() {
  while read line ; do
    if [[ $line =~ ^(.*)((TSAN_INTERCEPT|INTERCEPT_FUNCTION)\()([a-z,A-Z,0-9,_]+)(.*)$ ]] ; then
      results+=" ${BASH_REMATCH[4]}"
      results+=" __interceptor_${BASH_REMATCH[4]}"
    fi
  done < "$1"
}

# Interface functions.
results+=" __tsan_init"
results+=" __tsan_read*"
results+=" __tsan_write*"
results+=" __tsan_vptr*"
results+=" __tsan_func*"
results+=" __tsan_atomic*"
results+=" __tsan_java*"
results+=" __tsan_unaligned*"
results+=" __tsan_release"
results+=" __tsan_acquire"
results+=" __sanitizer_unaligned*"
results+=" __sanitizer_syscall*"
results+=" _Znwm"
results+=" _Znam"
results+=" _ZnwmRKSt9nothrow_t"
results+=" _ZnamRKSt9nothrow_t"
results+=" _ZdlPv"
results+=" _ZdlPvRKSt9nothrow_t"
results+=" _ZdaPv"
results+=" _ZdaPvRKSt9nothrow_t"
results+=" Annotate*"
results+=" WTFAnnotate*"
results+=" RunningOnValgrind"

collect rtl/tsan_interceptors.cc
collect ../sanitizer_common/sanitizer_common_interceptors.inc

results=`for i in $results; do echo $i; done | sort -f`
echo "# AUTO GENERATED by compiler-rt/lib/tsan/gen_dynamic_list.sh; EDITING IS FUTILE."
echo "{"
NM=`nm rtl/libtsan.a`
for i in $results; do
  # Remove symbols that are not present in the library.
  if [[ $NM =~ " $i" ]]; then
    echo "  $i;"
  else if [[ $i == *"*" ]]; then
    echo "  $i;"
  fi
  fi
done
echo "};"

