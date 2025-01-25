package com.actitime_automation.dec_13_2024;

import org.example.GenericUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ActiveEleEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=blr8c9qe0rki";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        driver.switchTo().activeElement().sendKeys("admin");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys("manager");
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);

        System.out.println("** Program Ends **");
    }

}
