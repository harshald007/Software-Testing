package com.actitime_automation.dec_23_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionsEx3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Program Start ***");
        String bName = "ch";
        String url = "https://demoqa.com/droppable";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        gu.scrollByPageDown(driver,1);
        Thread.sleep(2000);

        WebElement src = driver.findElement(By.id("draggable"));
        WebElement des = driver.findElement(By.cssSelector("#simpleDropContainer>#droppable"));

        Actions act = new Actions(driver);
        act.moveToElement(src).clickAndHold(src).moveToElement(des).release().build().perform();

        System.out.println("*** Program End ***");

    }
}
