package com.actitime_automation.jan_16_2025;


import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;
public class HandleStaleElementExceptionEx {
    public static void main(String[] args) throws InterruptedException{

        String bName = "ch";
        String URL = "http://127.0.0.1:83/login.do;jsessionid=cdaa5j3mifhh4";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, URL);
        driver.findElement(By.name("username")).sendKeys("admin");

        driver.findElement(By.name("pwd")).sendKeys("manager");

        driver.findElement(By.cssSelector("#loginButton")).click();

        gu.waitForVisibilityByType(driver, 10, "id", "logoutLink");

        driver.findElement(By.cssSelector("a[class='content tasks'] div[class='label']")).click();
        List<WebElement> tabNames = driver.findElements(By.cssSelector("#topnav .label"));
        List<WebElement> tabLinks = driver.findElements(By.cssSelector("#topnav td[class^='navItem relative']>a"));


        //printing tab names as per 'Selected'
        int size = tabNames.size();
        for (int i = 0; i < size; i++) {
            WebElement ele = tabLinks.get(i);
            String value = ele.getDomAttribute("class");
            WebElement eleName = tabNames.get(i);
            String name = eleName.getText();
            if (value.contains("selected")) {
                System.out.println("Seleted tab is " + name);
            } else {
                System.out.println(" NOT seleted tab is " + name);
            }
        }
        //*******************************************
        //Click on TASKS tab and again print which tab is selected and which are not.
        //Click on TASKS tab
        driver.findElement(By.cssSelector("a[class='content tasks'] div[class='label']")).click();
        //printing tab names as per 'Selected'
        //From line number 45 onwards, we may get 'StaleElementReferenceException'
        for (int i = 0; i < size; i++) {
            WebElement ele = tabLinks.get(i);
            String value = ele.getDomAttribute("class");
            WebElement eleName = tabNames.get(i);
            String name = eleName.getText();
            if (value.contains("selected")) {
                System.out.println("Seleted tab is " + name);
            } else {
                System.out.println(" NOT seleted tab is " + name);
            }
        }
    }

}

