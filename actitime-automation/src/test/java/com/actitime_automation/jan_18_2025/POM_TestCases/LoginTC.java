package com.actitime_automation.jan_18_2025.POM_TestCases;

import com.actitime_automation.jan_18_2025.Pom_Pages.LoginPage;
import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginTC {
    WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void initBrowser(){
        GenericUtility gu = new GenericUtility();
        ConfigReader cr = new ConfigReader();
        prop = cr.getPropObj();
        driver = gu.startUp(cr.getPropData("bName"), cr.getPropData("URL"));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
    @Test
    public void verifyLoginFunctionality(){
        System.out.println("verify login funcitnality");
        //launch browser
        LoginPage lpobj = new LoginPage(driver);
        //Enter username
        lpobj.EnterUserName(prop.getProperty("uName"));
        //Enter password
        lpobj.enterPassword(prop.getProperty("pwd"));
        //Click on login button
        lpobj.ClickOnLoginBtn();
        //verify dashboard page displayed

        //assertion
        Assert.assertTrue((new LoginPage(driver)).isSelectedTimeTrackTabDisplayed(),"Time-Track tab is not displayed.");
        //close the browser
        System.out.println("** Login Functionality completed.");
    }

    public void verifyLoginPageField(){
        //launch browser
        //Verify Username field is displayed
        //Verify Password field is displayed
        //Verify Keep me login checkbox is displayed
        //Verify Login button is displayed
        //Verify Login logos displayed
        //close the browser
    }

    public void verifyLoginPageTitle(){
        //launch browser
        //Verify Title
        //close the browser
    }
    public void verifyLoginPageURL() {
        //launch browser
        //Verify Title
        //close the browser
    }
}
