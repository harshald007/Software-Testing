package com.actitime_automation.basicProgram2;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardTitleURLEx {

    public static void main(String[] args){
        System.out.println("Programs start here");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);


        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();


        //wait for partial title match
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Enter Time-Track"));

        //wait for exact titile matching
        wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));


        //Title
        String expTitle= "actiTIME - Enter Time-Track";
        String actititle = driver.getTitle();
        if (actititle.equals(actititle)){
            System.out.println("Dashboard Title as expected.");
        }else {
            System.out.println("Dashboard Title is not expected.");
        }

        //URL
        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.urlContains(("submit_tt.do")));

        //match for exact url
        //OR
        wait.until(ExpectedConditions.urlMatches("submit_tt.do"));


         String expURL = "http://127.0.0.1:83/user/submit_tt.do";
         String actURL = driver.getCurrentUrl();
         if (expURL.equals(actURL)){
             System.out.println("DashBoard URl as expected");
         }else {
             System.out.println("Dashboard Url not as expected");
         }
        System.out.println("Programs ends here");





        }
    }







