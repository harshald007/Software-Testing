package com.actitime_automation.dec_26_2024;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ActtimeLoginEx2 {
    public static void main (String[] args){
        System.out.println("** Program Starts **");

        ConfigReader cr = new ConfigReader();


        String browserName = cr.getPropData("bName");
        String url = cr.getPropData("URL");
        String uName = cr.getPropData("uName");
        String Pwd = cr.getPropData("pwd");

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(browserName,url);






        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();



        System.out.println("** Program Ends **");

    }
}
