package com.actitime_automation.jan_02_2025;

import org.testng.annotations.Test;

public class Ex2 {
    @Test           //This will start the execution of Test Case
    public void testMethod1() {     //This is Test Case
        System.out.println("Test Method 1");
//        int div = 10 / 0;
    }
    @Test
    public void testMethod3() {         //Normal Method/NOT Test Case
        System.out.println("Test Method 3");
    }

    @Test           //This will start the execution of Test Case
    public void testMethod2() {     //This is Test Case
        System.out.println("Test Method 2");
    }
}
