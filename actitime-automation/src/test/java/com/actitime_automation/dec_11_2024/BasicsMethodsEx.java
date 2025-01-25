package com.actitime_automation.dec_11_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicsMethodsEx {
    public static void main(String[] args) {
        System.out.println("Program start ");

        String bName = "ch";
        String url = "https://demoqa.com/radio-button";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        WebElement yeslable = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        System.out.println("isselected" + yeslable.isDisplayed());

        WebElement yesRadiobutton = driver.findElement(By.id("yesRadio"));
        boolean isselected = yesRadiobutton.isSelected();
        System.out.println(isselected);

//        if (!isselected){
//            yesRadiobutton.click();
//            System.out.println("Clicked on Yes radio button.");
//        }else {
//            System.out.println("Yes Radio button is already selected.");
//
//        }

        WebElement noRadiobtn = driver.findElement(By.id("noRadio"));
        System.out.println("noradiobtn : "+ noRadiobtn);


    }
}
