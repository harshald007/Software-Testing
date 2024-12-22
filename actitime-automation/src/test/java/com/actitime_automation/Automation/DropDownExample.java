package com.actitime_automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {

    public static void main (String[] args) {
        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.navigate().to("https://www.amazon.in/");

        //locate dropdown
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

        //create object of select class
        Select select = new Select(dropdown);

        //select  value by text
        //select.selectByVisibleText("Electronics");

        //select by value
        //select.selectByValue("search-alias=electronics");

        //select by index
        select.selectByIndex(0);

        //enter mobile in search bar
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");

        //click on search icon
        driver.findElement(By.id("nav-search-submit-button")).click();

        //System.out.println(driver.getTitle());

        try {
            // Find all mobile titles using their common CSS class or XPath
            List<WebElement> mobileTitles = driver.findElements(By.cssSelector("span.a-text-normal"));

            // Print each mobile title
            for (WebElement title : mobileTitles) {
                System.out.println(title.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
