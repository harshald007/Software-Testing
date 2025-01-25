package com.actitime_automation.dec_10_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTextEx {
    public static void main (String[] args){
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement loginBoxHeader = driver.findElement(By.id("headerContainer"));
        String txt = loginBoxHeader.getText();
        System.out.println(txt);


        System.out.println("** Program End **");

    }
}
