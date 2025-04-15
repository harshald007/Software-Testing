package com.actitime_automation.jan_07_2025;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class ReportsEx2 {
    WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void initBrowser() {
        ConfigReader cr = new ConfigReader();
        prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void verifyLoginPageTitle() {
        String actTitle = driver.getTitle();
        String expTitle = "actiTIME - Login";
        Reporter.log("Actual Title : " + actTitle);
        if (expTitle.equals(actTitle)) {
            Reporter.log("Login title is as expected.");
        } else {
            Reporter.log("Login title is NOT as expected.");
        }
    }

    @Test
    public void verifyLoginPageURL() {
        String actURL = driver.getCurrentUrl();
        String expURL = "http://127.0.0.1:83/login.do";
        if (expURL.equals(actURL)) {
            Reporter.log("Login URL is as expected.");
        } else {
            Reporter.log("Login URL is NOT as expected.");
        }
    }

    @Test
    public void verifyLoginFunctionality() {
        driver.findElement(By.name("username")).sendKeys(prop.getProperty("uName"));
        driver.findElement(By.name("pwd")).sendKeys(prop.getProperty("pwd"));
        driver.findElement(By.cssSelector("#loginButton")).click();
        WebElement ttTab = driver.findElement(By.xpath("a[@class='content tt_selected selected']/div[normalize-space()='Time-Track']"));
        if(ttTab.isDisplayed()) {
            Reporter.log("Dashboard page is displayed.");
        } else {
            Reporter.log("Dashboard page is NOT displayed.");
        }
        driver.findElement(By.id("logoutLink")).click();
    }
//    @Test
//    public void verifyLoginFunctionality() {
//        driver.findElement(By.id("username")).sendKeys(prop.getProperty("uName"));
//        driver.findElement(By.cssSelector("pwd")).sendKeys(prop.getProperty("pwd"));
//        driver.findElement(By.cssSelector("#loginButton")).click();
//        WebElement ttTab = driver.findElement(By.xpath("//a[@class='content tt_selected selected']/div[normalize-space()='Time-Track']"));
//        if (ttTab.isDisplayed()) {
//            Reporter.log("Dashboard page is displayed.");
//        } else {
//            Reporter.log("Dashboard page is NOT displayed.");
//        }
//        driver.findElement(By.id("logoutLink")).click();
//    }

}
