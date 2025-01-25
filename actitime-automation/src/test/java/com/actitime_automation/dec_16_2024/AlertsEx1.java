package com.actitime_automation.dec_16_2024;

import org.example.GenericUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AlertsEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/alerts";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.findElement(By.id("promtButton")).click();

        Alert alt =driver.switchTo().alert();
        String txt = alt.getText();
        System.out.println(txt);

        alt.accept();

        System.out.println("** Program Ends **");
    }

}