package com.actitime_automation.dec_12_2024;

import org.example.GenericUtility;
import org.openqa.selenium.*;

public class ScrollEx1 {
    public static void main(String[] args) throws InterruptedException {
        String bName = "ch";
        String url = "https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement ele = driver.findElement(By.xpath("//html"));
        ele.sendKeys(Keys.PAGE_DOWN);       //scroll 1 page at a time
        System.out.println("** Program Ends **");
    }

}
