package com.actitime_automation.dec_12_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=blr8c9qe0rki";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        //WebElement ele = driver.findElement(By.id("username123"));

        List<WebElement> allEles = driver.findElements(By.id("username123"));
        System.out.println("size = " + allEles.size());     //0
        System.out.println("isEmpty = " + allEles.isEmpty());     //true
        System.out.println("** Program Ends **");
    }

}
