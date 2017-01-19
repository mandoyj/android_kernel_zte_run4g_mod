/* Copyright Statement:
 *
 * This software/firmware and related documentation ("MediaTek Software") are
 * protected under relevant copyright laws. The information contained herein is
 * confidential and proprietary to MediaTek Inc. and/or its licensors. Without
 * the prior written permission of MediaTek inc. and/or its licensors, any
 * reproduction, modification, use or disclosure of MediaTek Software, and
 * information contained herein, in whole or in part, shall be strictly
 * prohibited.
 * 
 * MediaTek Inc. (C) 2010. All rights reserved.
 * 
 * BY OPENING THIS FILE, RECEIVER HEREBY UNEQUIVOCALLY ACKNOWLEDGES AND AGREES
 * THAT THE SOFTWARE/FIRMWARE AND ITS DOCUMENTATIONS ("MEDIATEK SOFTWARE")
 * RECEIVED FROM MEDIATEK AND/OR ITS REPRESENTATIVES ARE PROVIDED TO RECEIVER
 * ON AN "AS-IS" BASIS ONLY. MEDIATEK EXPRESSLY DISCLAIMS ANY AND ALL
 * WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NONINFRINGEMENT. NEITHER DOES MEDIATEK PROVIDE ANY WARRANTY WHATSOEVER WITH
 * RESPECT TO THE SOFTWARE OF ANY THIRD PARTY WHICH MAY BE USED BY,
 * INCORPORATED IN, OR SUPPLIED WITH THE MEDIATEK SOFTWARE, AND RECEIVER AGREES
 * TO LOOK ONLY TO SUCH THIRD PARTY FOR ANY WARRANTY CLAIM RELATING THERETO.
 * RECEIVER EXPRESSLY ACKNOWLEDGES THAT IT IS RECEIVER'S SOLE RESPONSIBILITY TO
 * OBTAIN FROM ANY THIRD PARTY ALL PROPER LICENSES CONTAINED IN MEDIATEK
 * SOFTWARE. MEDIATEK SHALL ALSO NOT BE RESPONSIBLE FOR ANY MEDIATEK SOFTWARE
 * RELEASES MADE TO RECEIVER'S SPECIFICATION OR TO CONFORM TO A PARTICULAR
 * STANDARD OR OPEN FORUM. RECEIVER'S SOLE AND EXCLUSIVE REMEDY AND MEDIATEK'S
 * ENTIRE AND CUMULATIVE LIABILITY WITH RESPECT TO THE MEDIATEK SOFTWARE
 * RELEASED HEREUNDER WILL BE, AT MEDIATEK'S OPTION, TO REVISE OR REPLACE THE
 * MEDIATEK SOFTWARE AT ISSUE, OR REFUND ANY SOFTWARE LICENSE FEES OR SERVICE
 * CHARGE PAID BY RECEIVER TO MEDIATEK FOR SUCH MEDIATEK SOFTWARE AT ISSUE.
 *
 * The following software/firmware and/or related documentation ("MediaTek
 * Software") have been modified by MediaTek Inc. All revisions are subject to
 * any receiver's applicable license agreements with MediaTek Inc.
 */

package com.mediatek.weather3dwidget;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import com.mediatek.weather3dwidget.DayNight;
import com.mediatek.weather3dwidget.Util;
import com.mediatek.weather3dwidget.WeatherActivity;
import com.mediatek.weather3dwidget.WeatherType;

import java.lang.Readable;
import java.lang.String;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.mediatek.weather3dwidget.WeatherTypeTest \
 * com.mediatek.weather3dwidget.tests/android.test.InstrumentationTestRunner
 */
public class WeatherTypeTest extends ActivityInstrumentationTestCase2<WeatherActivity> {
    private Instrumentation mInstrumentation;
    private WeatherActivity mActivity;

    public WeatherTypeTest() {
        super("com.mediatek.weather3dwidget", WeatherActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mInstrumentation = getInstrumentation();
        mActivity = getActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        mInstrumentation = null;
        mActivity = null;

        super.tearDown();
    }

    // test case #1
    public void test01IsSunMoonType() {
        assertTrue(WeatherType.isSunMoonNeededModelType(WeatherType.ModelType.SUNNY));
        assertFalse(WeatherType.isSunMoonNeededModelType(WeatherType.ModelType.RAIN));
    }

    // test case #2
    public void test02IsSnowType() {
        assertTrue(WeatherType.isSnowModelType(WeatherType.ModelType.SNOW));
        assertFalse(WeatherType.isSnowModelType(WeatherType.ModelType.SUNNY));
    }

    // test case #3
    public void test03IsSandType() {
        assertTrue(WeatherType.isSandModelType(WeatherType.ModelType.SAND));
        assertFalse(WeatherType.isSandModelType(WeatherType.ModelType.SUNNY));
    }

    // test case #4
    public void test04GetWeatherIcon() {
        assertEquals(R.drawable.ic_sunny, WeatherType.getWeatherIcon(WeatherType.ModelType.SUNNY));
    }

    // test case #5
    public void test05ConvertToModelType() {
        assertEquals(WeatherType.ModelType.SUNNY, WeatherType.convertToModelType(WeatherType.Type.SUNNY));
    }

    // test case #6
    public void test06IsModelTypeInRange() {
        int testType = WeatherType.ModelType.SUNNY;
        assertTrue(WeatherType.isModelTypeInRange(testType));

        testType = WeatherType.ModelType.INDEX_MAX + 1;
        assertFalse(WeatherType.isModelTypeInRange(testType));

        testType = WeatherType.ModelType.INDEX_MIN - 1;
        assertFalse(WeatherType.isModelTypeInRange(testType));
    }
}