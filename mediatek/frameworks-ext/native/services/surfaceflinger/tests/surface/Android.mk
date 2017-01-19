LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_C_INCLUDES := \
	$(TOP)/$(MTK_ROOT)/hardware/gralloc_extra/include

LOCAL_SRC_FILES:= \
	surface.cpp

LOCAL_SHARED_LIBRARIES := \
	libcutils \
	libutils \
	libbinder \
    libui \
    libgui

LOCAL_MODULE:= test-surface

LOCAL_MODULE_TAGS := tests

include $(BUILD_EXECUTABLE)