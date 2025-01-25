package com.actitime_automation.dec_19_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WO_Multi_Select_Ex3 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
        gu.scrollByPageDown(driver,1);
        Thread.sleep(2000);

        WebElement ddlEle = driver.findElement(By.xpath("//div[text()='Select...']"));
        ddlEle.click();

        driver.findElement(By.xpath("//div[text()='Black']")).click();
        driver.findElement(By.xpath("//div[text()='Red']")).click();


        System.out.println("** Program Ends **");
    }
}
