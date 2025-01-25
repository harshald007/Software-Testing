package com.actitime_automation.dec_22_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Start**");
        String bName="ch";
        String url="http://127.0.0.1:83/login.do;jsessionid=1xfiawrjsq1r6";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        Actions act = new Actions(driver);

        WebElement usernamefield = driver.findElement(By.name("username"));
        act.sendKeys(usernamefield,"admin").perform();


        WebElement pwdfield = driver.findElement(By.name("pwd"));
        act.sendKeys(pwdfield,"manager").perform();


        WebElement loginbtn = driver.findElement(By.cssSelector("#loginButton"));
        act.click(loginbtn).perform();

    }

}
