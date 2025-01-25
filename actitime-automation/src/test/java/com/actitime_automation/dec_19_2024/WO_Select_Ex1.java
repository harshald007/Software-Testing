package com.actitime_automation.dec_19_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WO_Select_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        WebElement ddlEle = driver.findElement(By.cssSelector("#withOptGroup div[class*='placeholder']"));
        ddlEle.click();

        driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
        System.out.println(driver.findElement(By.xpath("//div[text()='Group 1, option 1']")));

        System.out.println("** Program Ends **");
    }
}
