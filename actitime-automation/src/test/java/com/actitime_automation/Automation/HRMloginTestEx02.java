package com.actitime_automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMloginTestEx02 {
    public static void main (String[] args) throws InterruptedException{

        //1. create browser instance
        WebDriver driver = new ChromeDriver();

        //2.launch brwser instance with url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //3. wait for loading the web page to locate the web element
        Thread.sleep(5000);

        //4.find the element and send the data to element
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//div/input[@type='password']")).sendKeys("admin123");

        //click login button element
        driver.findElement(By.xpath("//div/button[@ type='submit']")).click();

        driver.close();


    }
}
