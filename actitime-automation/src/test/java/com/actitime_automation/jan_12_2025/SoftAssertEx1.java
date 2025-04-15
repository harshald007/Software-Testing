package com.actitime_automation.jan_12_2025;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Properties;

public class SoftAssertEx1 {
    @Test
    public void testMethod1() {
        System.out.println("Test 1 Starts");
        SoftAssert sa = new SoftAssert();
        int a = 10;
        sa.assertEquals(a, 20);
        sa.assertEquals(a, 20, "'a' should be 10.");
        System.out.println("--- equals executed ----");

        String str = "Mumbai";
        //sa.assertNotEquals(str, "Delhi");
        sa.assertNotEquals(str, "Mumbai", "Both values should not be SAME.");
        System.out.println("--- NOT equals executed ----");

        int ar[] = {50,20,-10,40};
        sa.assertTrue(ar.length != 0);
        System.out.println("--- assertTrue executed ----");

        sa.assertFalse(ar.length == 0);
        System.out.println("--- assertFalse executed ----");
        sa.assertAll();
        System.out.println("Test 1 Ends");
    }

    @Test
    public void testMethod2() {
        System.out.println(" Test Method 2");
    }
}

