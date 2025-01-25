package com.actitime_automation.dec_17_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;


public class WindowHandleEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        String bName="ch";
        String url="https://demoqa.com/browser-windows";

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        String PrentId1 = driver.getWindowHandle();
        System.out.println("Windowid" + PrentId1); //returns current window id, pointed by driver

        driver.findElement(By.cssSelector("#tabButton")).click();     //opens new window

        String ParentId2 = driver.getWindowHandle();
        System.out.println("Window"+ ParentId2);  //returns current window id, pointed by driver

        Set<String> allWindID = driver.getWindowHandles();
        //returns all window ids which are opened by current WebDriver instance

        Iterator<String> itr = allWindID.iterator();
        String winId = itr.next();
        if (winId.equals(PrentId1)){
            winId= itr.next();
        }
        driver.switchTo().window(winId);
        WebElement ele = driver.findElement(By.cssSelector("h1[id='sampleHeading']"));
        String txt = ele.getText();
        System.out.println("Text : " + txt);


        System.out.println("** Program Ends **");

    }
}
