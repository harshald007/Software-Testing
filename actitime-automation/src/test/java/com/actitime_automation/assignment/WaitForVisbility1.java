package com.actitime_automation.assignment;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

public class WaitForVisbility1 {
    private static final Logger log = LoggerFactory.getLogger(WaitForVisbility1.class);

    public static void main(String[] args){
        String bName = "ch";
        String url = "http://127.0.0.1:83/login.do;jsessionid=1mn5pb2gof5eq";
        WaitForVisbility1 obj = new WaitForVisbility1();
        obj.elementPractice(bName , url);
        }
        public void elementPractice(String bName, String url) {
        System.out.println("***program start***");

            GenericUtility gu = new GenericUtility();
            WebDriver driver = gu.startUp(bName,url);

            By userNameObj = By.name("username");
            WebElement userNameField = driver.findElement(userNameObj);
            userNameField.sendKeys("admin");

            By pwdObj = By.name("pwd");
            WebElement passwordField = driver.findElement(pwdObj);
            passwordField.sendKeys("manager");

            By loginObj = By.cssSelector("#loginButton");
            WebElement loginBtn = driver.findElement(loginObj);
            loginBtn.click();



//
//        driver.findElement(By.className("textField")).sendKeys("admin");
//        driver.findElement(By.name("pwd")).sendKeys("manager");
//        driver.findElement(By.id("loginButton")).click();
//        System.out.println("TextField");

    }
}
