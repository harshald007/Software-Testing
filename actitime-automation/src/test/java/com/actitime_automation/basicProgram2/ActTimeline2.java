package com.actitime_automation.basicProgram2;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActTimeline2 {

    public static void main(String[] args){
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";

            GenericUtility gu = new GenericUtility();
            WebDriver driver = gu.startUp(bName, url);

            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("pwd")).sendKeys("manager");
            driver.findElement(By.cssSelector("#loginButton")).click();


            // logout the admin accout
            driver.findElement(By.id("logoutLink")).click();


        }
    }





