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

import java.util.Properties;

public class HardAssertTC {

    WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void initBrowser(){
        ConfigReader cr = new ConfigReader();
        prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        driver= gu.startUp(prop.getProperty("bName"), prop.getProperty("URL") );
            }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
    @Test
    public void verifyLoginPageTitle(){
        System.out.println("Login Page title test case started.");
        String actTitle = driver.getTitle();
        String expTitle = "actiTIME - Login";
        Assert.assertEquals(actTitle,expTitle,"login title is changed");
        /*if(expTitle.equals(actTitle)) {
            System.out.println("Login title is as expected.");
        } else {
            System.out.println("Login title is NOT as expected.");
        }*/
        System.out.println("Login Page title test case executed.");

    }
    @Test
    public void verifyLoginPageURL(){
        System.out.println("Login Page URL test case started.");
        String actURL = driver.getCurrentUrl();
        String expURL = "http://127.0.0.1:83/login.do";
        Assert.assertEquals(actURL,expURL,"Login title is displayed");

    }
    @Test
    public void VerifyLoginFunctionality() {
        //Enter user name
        driver.findElement(By.name("username")).sendKeys(prop.getProperty("uName"));
        //Enter password
        driver.findElement(By.name("pwd")).sendKeys(prop.getProperty("pwd"));
        //Click on login button
        driver.findElement(By.cssSelector("#loginButton")).click();

        //verify dashboard page is displayed
        //way 1:
        WebElement ttTab = driver.findElement(By.xpath("//a[@class='content tt_selected selected']/div[normalize-space()='Time-Track']"));
        /*if(ttTab.isDisplayed()) {
            System.out.println("Dashboard page is displayed.");
        } else {
            System.out.println("Dashboard page is NOT displayed.");
        }*/
        driver.findElement(By.cssSelector("#logoutLink")).click();
        System.out.println("Login functionality test case executed.");
        driver.quit();
    }
}

