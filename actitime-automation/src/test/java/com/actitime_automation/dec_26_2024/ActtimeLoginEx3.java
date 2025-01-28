package com.actitime_automation.dec_26_2024;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ActtimeLoginEx3 {
    public static void main (String[] args){
        System.out.println("** Program Starts **");

        ConfigReader cr = new ConfigReader();
        Properties prop = cr.getPropObj();

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(prop.getProperty("bName"), prop.getProperty("URL"));

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();



        System.out.println("** Program Ends **");

    }
}
