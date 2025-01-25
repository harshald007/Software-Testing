package com.actitime_automation.dec_22_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class W_Single_Select_Ex2 {
    public static void main(String[] args) {
        System.out.println("** Program Start**");
        String bName="ch";
        String url="https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        //step 1: identify the dropdown element
        WebElement ddlEle = driver.findElement(By.id("oldSelectMenu"));

        //step 2: create object of 'Select' class by passing above ele
        Select sel = new Select(ddlEle);

        //to select data in dropdown
        //way 1: by using text/ WebElement's text
        //sel.selectByVisibleText("Aqua");

        //way 2: by using value attribute name's value
        sel.selectByValue("10");            //Aqua

        //way 3: by using index
        //way 3: by using index
        //sel.selectByIndex(10);              //Aqua

        //verify selected color in dropdown
        WebElement selectedColorEle = sel.getFirstSelectedOption();
        String selectedColor = selectedColorEle.getText();
        System.out.println("Selected Color : " + selectedColor);
        //OR
        //System.out.println("Selected Color : " + sel.getFirstSelectedOption().getText());

        System.out.println("** Program Ends **");



    }

}
