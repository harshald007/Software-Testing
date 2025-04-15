package com.actitime_automation.jan_03_2025;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class WO_AnnotationsTC {
    WebDriver driver;//global object
    Properties prop;

    @BeforeMethod
    public void intiBrowser() {
        //Read the Properties file
        ConfigReader cr = new ConfigReader();
        prop = cr.getPropObj();

        //Launch the browser & URL
        GenericUtility gu = new GenericUtility();
        driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void verifyLoginPageTitle() {
        //get the actual title
        String actTitle = driver.getTitle();
        //verify the title
        String exptitle = "actiTIME - Login";
        if (actTitle.equals(exptitle)) {
            System.out.println("Login title is expected");
        } else {
            System.out.println("Login tile is not expected");
        }
    }

    @Test
    public void verifyLoginPageURL() {
        //get the actual URL
        String actURl = driver.getCurrentUrl();
        //verify the title
        String expURl = "http://127.0.0.1:83/login.do;jsessionid=10qsi4nkanb8q";
        if (expURl.equals(actURl)) {
            System.out.println("As expected url");
        } else {
            System.out.println("As n                ot Expected url");
        }
    }

    @Test
    public void verifyLoginFunctionality(){
        //enter username
        driver.findElement(By.name("username")).sendKeys("admin");
        //enter  password
        driver.findElement(By.name("pwd")).sendKeys("manager");
        //click on login button
        driver.findElement(By.cssSelector("#loginButton")).click();

        WebElement tab = driver.findElement(By.xpath("//div[normalize-space()='Time-Track']"));
        if (tab.isDisplayed()){
            System.out.println("DashBoard is Display");
        }else {
            System.out.println("DashBoard is not Display");
        }
        driver.findElement(By.id("logoutlink")).click();
    }
}

