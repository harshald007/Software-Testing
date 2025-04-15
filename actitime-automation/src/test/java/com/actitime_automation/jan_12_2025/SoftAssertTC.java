package com.actitime_automation.jan_12_2025;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Properties;

public class SoftAssertTC {
    @Test
    public void verifyLoginPageTitle() {
        System.out.println("Test Case started.");
        int a = 10, b = 20;
        int sum = a + b;
        ConfigReader cr = new ConfigReader();
        GenericUtility gu = new GenericUtility();
        Properties prop = cr.getPropObj();
        WebDriver driver = gu.startUp(cr.getPropData("bName"), cr.getPropData("URL"));
        System.out.println("Login Page Title & URL test case started.");

        SoftAssert sa = new SoftAssert();
        String actTitile = driver.getTitle();
        String expTitle = "actiTIME - Login123";
        sa.assertEquals(actTitile,expTitle,"Login Title is Changed");

        String actURL = driver.getCurrentUrl();
        String expURL = "http://127.0.0.1:83/login.do";
        sa.assertEquals(actURL,expURL,"given url is as expected");
        System.out.println("login page title and URL test cases is executed");
    }

}

