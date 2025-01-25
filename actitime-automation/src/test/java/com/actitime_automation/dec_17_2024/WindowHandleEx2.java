package com.actitime_automation.dec_17_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FilterOutputStream;
import java.util.Iterator;
import java.util.Set;


public class WindowHandleEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        String bName="ch";
        String url="https://demoqa.com/browser-windows";

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        String parentId = driver.getWindowHandle();
        System.out.println("windows :-" + parentId); //returns current window id, pointed by driver

        driver.findElement(By.cssSelector("#tabButton")).click();  //opens new window


        Set<String> allwinId = driver.getWindowHandles();
        //returns all window ids which are opened by current WebDriver instance


        Iterator<String> Itr = allwinId.iterator();
        while (Itr.hasNext()){
            String WinId = Itr.next();
            if (WinId.equals(parentId)){
                WinId = Itr.next();
            }
            driver.switchTo().window(WinId);
            try {
                WebElement ele = driver.findElement(By.cssSelector("h1 [id='sampleHeading']"));
                String txt = ele.getText();
                System.out.println("Text :- "+ txt);
                driver.close();
                break;
            }catch (Exception e){
                driver.close();
            }
        }
        driver.switchTo().window(parentId);

        System.out.println("** Program Ends **");

    }
}
