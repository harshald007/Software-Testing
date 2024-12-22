package com.actitime_automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.in/");

        //locate Dropdown
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

        //create object of select class
        Select select = new Select(dropdown);

        //select value by text
        select.selectByVisibleText("Electronics");

    }
}
