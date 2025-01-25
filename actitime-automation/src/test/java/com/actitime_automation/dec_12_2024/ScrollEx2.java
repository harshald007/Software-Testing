package com.actitime_automation.dec_12_2024;

import org.example.GenericUtility;
import org.openqa.selenium.*;

public class ScrollEx2 {
    public static void main(String[] args) throws InterruptedException {
        String bName = "ch";
        String url = "https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement ele = driver.findElement(By.id("submit"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", ele);
        //scrolls the page till the 'ele' WebElement is displayed

        System.out.println("** Program Ends **");
    }

}
