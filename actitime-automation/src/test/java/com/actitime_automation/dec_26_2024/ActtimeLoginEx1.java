package com.actitime_automation.dec_26_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ActtimeLoginEx1 {
    public static void main (String[] args){
        System.out.println("** Program Starts **");

        try {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "./ConfigurationDetails/Config.properties");
            Properties prop = new Properties();
            prop.load(fis);

            String browserName = prop.getProperty("bName");
            System.out.println("browserName: " + browserName );

            String URL = prop.getProperty("URL");
            System.out.println("URL: " + URL );

            String username = prop.getProperty("uName");
            System.out.println("UserName: " + username );

            String pwd = prop.getProperty("pwd");
            System.out.println("Password: " + pwd );

            GenericUtility gu = new GenericUtility();
            WebDriver driver = gu.startUp(browserName, URL);

            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("pwd")).sendKeys("manager");
            driver.findElement(By.cssSelector("#loginButton")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("** Program Ends **");

    }
}
