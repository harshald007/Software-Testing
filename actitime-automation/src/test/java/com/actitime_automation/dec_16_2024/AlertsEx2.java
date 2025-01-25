package com.actitime_automation.dec_16_2024;

import org.example.GenericUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/alerts";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.findElement(By.id("timerAlertButton")).click();

        // explicit wait : time is taking time to display

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alt = driver.switchTo().alert();
        String txt = alt.getText();
        System.out.println(txt);

        alt.accept();

        System.out.println("** Program Ends **");
    }

}
