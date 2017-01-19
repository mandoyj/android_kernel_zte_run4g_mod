/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mediatek.common.view.tests;

import com.mediatek.common.view.tests.Merge;

import android.test.ActivityInstrumentationTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.ViewGroup;

public class MergeTest extends ActivityInstrumentationTestCase<Merge> {
    public MergeTest() {
        super("com.mediatek.common.view.tests", Merge.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @MediumTest
    public void testMerged() throws Exception {
        final Merge activity = getActivity();
        final ViewGroup layout = activity.getLayout();

        assertEquals("The layout wasn't merged", 7, layout.getChildCount());
    }
}
