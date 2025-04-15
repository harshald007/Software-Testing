package com.actitime_automation.jan_07_2025;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Properties;

public class ParametersEx {
    @Parameters({"username", "password"})
    @Test
    public void VerifyLoginFunctionality(String uName, String pwd)
    {
        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));
        driver.findElement(By.name("username")).sendKeys(uName);
        driver.findElement(By.name("pwd")).sendKeys(pwd);
        driver.findElement(By.cssSelector("#loginbutton")).click();
//        WebElement ttTab = driver.findElement(By.xpath("//a[@class='content tt_selected selected']/div[normalize-space()='Time-Track']"));
//        if (ttTab.isDisplayed()) {
//            Reporter.log("Dashboard Page is display");
//        } else {
//            Reporter.log("Dashboard Page is not display");
//        }
        driver.findElement(By.cssSelector("#logoutLink"));
        driver.quit();
    }
}
