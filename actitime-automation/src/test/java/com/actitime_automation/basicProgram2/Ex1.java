package com.actitime_automation.basicProgram2;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex1 {

    public static void main(String[] args){;
        System.out.println("** Program Start**");

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","http://127.0.0.1:83/login.do;jsessionid=v9f2f9lqv2tq");
        String str = driver.getPageSource();
        System.out.println(str);


        System.out.println("** Program end**");

        }
    }






