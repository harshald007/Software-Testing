package com.actitime_automation.assignment;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class WaitForVisbility1 {
    public static void main(String[] args){
        String bName = "ch";
        String url = "http://localhost:93/login.do";
        WaitForVisbility1 obj = new WaitForVisbility1();
        obj.elementPractice(bName , url);
        }
        public void elementPractice(String bName, String url) {
        System.out.println("***program start***");

            GenericUtility gu = new GenericUtility();

            WebDriver driver1 = gu.startUp(bName,url);
            By userNameObj = By.id("username");
        WebElement userNameField = driver.findElement(userNameObj);

        By pwdObj = By.cssSelector(".textField.pwdfield");
        WebElement passwordField = driver.findElement(pwdObj);

        By loginObj = By.cssSelector("#loginButton>div");
        WebElement loginBtn = driver.findElement(loginObj);
        }
        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj");
//
//        driver.findElement(By.className("textField")).sendKeys("admin");
//        driver.findElement(By.name("pwd")).sendKeys("manager");
//        driver.findElement(By.id("loginButton")).click();
//        System.out.println("TextField");

    }
