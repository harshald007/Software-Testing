package com.actitime_automation.basicProgram1;

import org.example.GenericUtility;
import org.openqa.selenium.WebDriver;

import java.util.SortedMap;

public class Ex4 {
    public static void main(String[] args) {

        System.out.println("Program Starts");

        GenericUtility gu = new GenericUtility();
//        WebDriver driver = gu.startUp("ch","https://www.google.com/");
//        WebDriver driver = gu.startUp("ch","https://demoqa.com/");
        WebDriver driver = gu.startUp("ch","http://127.0.0.1:83/login.do;jsessionid=v9f2f9lqv2tq");
        String actTitle = driver.getTitle();
        String expTitle = "actiTIME - Login";
        System.out.println("actTitle:"+actTitle);
        if (actTitle.equals(expTitle)){
            System.out.println("Titile is ecpected");
        }else {
            System.out.println("Title is not as expected");
        }

        System.out.println("programs ends");




    }
}
