package com.actitime_automation.basicProgram2;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitEx1 {

    public static void main(String[] args){;
        System.out.println("** Program Start**");
        String bName ="ch";
        String url ="http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();

//        WebElement logoutele = driver.findElement(By.id("logoutink"));

        WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
        wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutlink"))));

        driver.findElement(By.id("logoutlink")).click();

        System.out.println("** Program end**");

        }
    }






