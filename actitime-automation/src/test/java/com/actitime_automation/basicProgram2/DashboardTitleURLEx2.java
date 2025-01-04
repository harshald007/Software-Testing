package com.actitime_automation.basicProgram2;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardTitleURLEx2 {

    public static void main(String[] args){
        System.out.println("Programs start here");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        //login credentials
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();


        gu.waitForTitleContains(driver,10,"Enter Time-Track");

        //Title
        String expTitle ="actiTIME - Enter Time-Track";
        String actTitle = driver.getTitle();
        if (expTitle.equals(actTitle)){
            System.out.println("Dashboard Title as expected");
        }else {
            System.out.println("Dashboard Title not as expected");
        }

        //URl
        gu.waitForURLContains(driver,10,"submit_tt.do");

        String expUrl = "http://127.0.0.1:83/user/submit_tt.do";
        String actUrl = driver.getCurrentUrl();

        if (expUrl.equals(actUrl)){
            System.out.println("Dashboard URL as expected.");
        }else {
            System.out.println("Dashboard URL not as expected.");
        }
        System.out.println("program stop here");

        }
    }







