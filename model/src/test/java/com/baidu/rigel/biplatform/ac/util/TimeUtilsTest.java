/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.rigel.biplatform.ac.util;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

/**
 *Description:
 * @author david.wang
 *
 */
public class TimeUtilsTest {
    
    private static SimpleDateFormat f = new SimpleDateFormat ("yyyyMMdd");
    
    @Test
    public void testGetDays () {
        TimeRangeDetail time = TimeUtils.getDays(0, 0);
        Assert.assertEquals (time.getStart (), time.getEnd ());
        Assert.assertEquals (f.format (new Date()), time.getStart ());
    }
    
    @Test
    public void testGetDaysWithDay () {
        TimeRangeDetail time = TimeUtils.getDays(null, 0, 0);
        Assert.assertEquals (time.getStart (), time.getEnd ());
        Assert.assertEquals (f.format (new Date()), time.getStart ());
        
        time = TimeUtils.getDays(null, -1, -1);
        Assert.assertEquals (time.getStart (), time.getEnd ());
        Assert.assertEquals (f.format (new Date()), time.getStart ());
        
        time = TimeUtils.getDays(new Date(), 0, 0);
        Assert.assertEquals (time.getStart (), time.getEnd ());
        Assert.assertEquals (f.format (new Date()), time.getStart ());
    }
    
    
}
