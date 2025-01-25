package com.actitime_automation.dec_12_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsEx2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=blr8c9qe0rki";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton")).click();
        gu.waitForVisibilityByType(driver, 10, "id", "logoutLink");

        List<WebElement> tabNames = driver.findElements(By.cssSelector("#topnav .label"));
        WebElement ele1 = tabNames.get(0);  //1st tab: TIME-TRACK
        //System.out.println(ele1);           //prints address

        String tabName1 = ele1.getText();
        System.out.println(tabName1);           //prints 1st tab name

        System.out.println("*****************");
        //printing all tab names
        int size = tabNames.size();
        for(int i=0; i<size; i++) {
            WebElement ele = tabNames.get(i);
            String tabName = ele.getText();
            System.out.println(tabName);
        }

        System.out.println("** Program Ends **");
    }

}
