package com.actitime_automation.dec_22_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class W_Multi_Select_Ex3 {
    public static void main(String[] args) {
        System.out.println("** Program Start**");
        String bName="ch";
        String url="https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        //step 1: identify the dropdown element
        WebElement ddlEle = driver.findElement(By.id("cars"));
        gu.scrollByJS(driver, ddlEle);
        //step 2: create object of 'Select' class by passing above ele
        Select sel = new Select(ddlEle);

        sel.selectByVisibleText("Volvo");
        sel.selectByValue("opel");
        sel.selectByIndex(3);

        //Verify cars selected or not:
        List<WebElement> selectedOptions = sel.getAllSelectedOptions(); //selected options from DDL
        List<String> selectedCars = gu.getAllTextFromList(selectedOptions);     //generic method

        if(selectedCars.isEmpty()) {
            System.out.println("No Cars are selected.");
        } else {
            System.out.println("Cars are selected.");
            System.out.println("Selected Cars : "+ selectedCars);
        }

        System.out.println("** Program Ends **");



    }

}
