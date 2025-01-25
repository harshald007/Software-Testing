package com.actitime_automation.dec_13_2024;

import org.example.GenericUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BrowserOperationsEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=qhc3laf1jawx";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().back();       //navigate back to actitime URL
        Thread.sleep(2000);
        driver.navigate().forward();    //navigate to google again
        Thread.sleep(2000);
        driver.navigate().refresh();    //refresh the page

        System.out.println("** Program Ends **");
    }

}
