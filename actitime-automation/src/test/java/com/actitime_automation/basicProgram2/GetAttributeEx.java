package com.actitime_automation.basicProgram2;

import org.apache.poi.common.usermodel.GenericRecord;
import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetAttributeEx {

    public static void main(String[] args){;
        System.out.println("** Program Start**");

        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","http://127.0.0.1:83/login.do;jsessionid=4phof5ht9u1mj");
        System.out.println("** Program end**");

        }
    }






