package com.actitime_automation.dec_20_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class W_Single_Select_Ex1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        String bName = "ch";
        String url = "https://demoqa.com/select-menu";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);

        //step 1: identify the dropdown element
        WebElement ddlEle = driver.findElement(By.id("oldSelectMenu"));
        System.out.println(ddlEle);

        //step 2: create object of 'Select' class by passing above ele]
        Select sel = new Select(ddlEle);


        //get the selected option from dropdown
        WebElement SelectedOption = sel.getFirstSelectedOption();
        String SelectedColor = SelectedOption.getText();
        if (SelectedColor.equals("Red")){
            System.out.println("Color is selected");
        }else {
            System.out.println("Color is not selected");
        }

        //get all options from dropdown
        List<WebElement> alloptions = sel.getOptions();
        int numofColor = alloptions.size();
        System.out.println(numofColor);

        //verify all colors with expected

        String[] Expectedcolor1 = {"Red","Blue","Green","Yellow","Purple",
                "Black","White","Voilet","Indigo","Magenta","Aqua"};
        List<String> actualColors = gu.getAllTextFromList(alloptions);

        //convert both in same type
        //converting array into list
        List<String> expectedColors = Arrays.asList(Expectedcolor1);
        if (expectedColors.equals(actualColors)){
            System.out.println("drop down contain color");
        }else {
            System.out.println("drop down contain not color");
        }
        System.out.println("**programs ends**");
    }
}
