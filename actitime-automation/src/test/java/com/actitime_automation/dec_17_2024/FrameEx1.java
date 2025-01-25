package com.actitime_automation.dec_17_2024;

import org.example.ConfigReader;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class FrameEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/frames";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.switchTo().frame("frame1");
        WebElement ele =driver.findElement(By.id("sampleHeading"));
        String txt = ele.getText();
        System.out.println("TEXT : " + txt);

        System.out.println("** Program Ends **");

    }
}
