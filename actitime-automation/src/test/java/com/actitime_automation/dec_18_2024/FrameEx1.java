package com.actitime_automation.dec_18_2024;

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

        WebElement frameEle = driver.findElement(By.id("frame1"));

        driver.switchTo().frame(frameEle);  //iframe as WebElement
        //driver.switchTo().frame(4);     //iframe tag index
        //driver.switchTo().frame("frame1");        //idValue  or nameValue


        WebElement ele = driver.findElement(By.id("sampleHeading"));
        String txt = ele.getText();
        System.out.println("TEXT : " + txt);

        System.out.println(frameEle);

    }
}
