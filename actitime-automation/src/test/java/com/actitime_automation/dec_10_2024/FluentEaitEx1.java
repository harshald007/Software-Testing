package com.actitime_automation.dec_10_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentEaitEx1 {
    public static void main (String[] args){
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";

        GenericUtility gu = new GenericUtility();

        WebDriver driver = gu.startUp(bName, url);

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();

        //using fluent wait by using explicit wait syntax:
        //way 1:
        FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
        fw.withTimeout(Duration.ofSeconds(10));
        fw.pollingEvery(Duration.ofMillis(200));
        fw.ignoring(Exception.class);
        fw.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

//        way 2:
        FluentWait<WebDriver> fw2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
        fw2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("logoutLink")));
////
////        //way 3:
        new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofMillis(200)).ignoring(Exception.class)
                        .until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));



        driver.findElement(By.id("logoutLink")).click();

        System.out.println("** Program End **");

    }
}
