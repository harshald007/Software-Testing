package com.actitime_automation.dec_10_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FluentEaitEx2 {
    public static void main (String[] args){
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";

        GenericUtility gu = new GenericUtility();

        WebDriver driver = gu.startUp(bName, url);

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();

        ////using fluent wait by using its own syntax:




        driver.findElement(By.id("logoutLink")).click();

        System.out.println("** Program End **");

    }
}
