package com.actitime_automation.dec_22_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx2 {
    public static void main(String[] args)throws InterruptedException{
        System.out.println("** Program Start**");
        String bName="ch";
        String url="https://demoqa.com/droppable";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        gu.scrollByPageDown(driver,1);
        Thread.sleep(2000);

        WebElement src = driver.findElement(By.id("draggable"));

        Actions act = new Actions(driver);

        act.dragAndDropBy(src,170,50).perform();

        System.out.println("*** Program Stop");
    }

}
