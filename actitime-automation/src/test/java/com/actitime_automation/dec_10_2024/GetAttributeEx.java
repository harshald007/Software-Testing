package com.actitime_automation.dec_10_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeEx {
    public static void main (String[] args){
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj";

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        WebElement loginBoxHeader = driver.findElement(By.id("headerContainer"));
        // getAttribute method returns the respective(which we passed as parameter) attribute value

        String value = loginBoxHeader.getAttribute("class");
        System.out.println("Value:-"+value);


        //OR
        //from Selenium 4.27.0  & onwards, alternative for .getAttribute(String attribName) method

        String value2 = loginBoxHeader.getAttribute("class");
        System.out.println(value2);

        System.out.println("** Program End **");

    }
}
