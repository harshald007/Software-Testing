package com.actitime_automation.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultiTabOperations {
    public static void main(String[] args){



    //launch the web browser
    WebDriver driver = new ChromeDriver();

    //maximize the window size
    driver.manage().window().maximize();

    //minimize the window size
    driver.manage().window().minimize();

    //fullscreen the window size
    driver.manage().window().fullscreen();


    //navigate to amazon website
    driver.navigate().to("https://www.amazon.in/");

    //get the id of first tab
    String firstTabId = driver.getWindowHandle();

    //create new tab and navigate to redbus website
    driver.switchTo().newWindow(WindowType.TAB);

    //navigate to redbus website
    driver.get("https://www.redbus.in/");

    //get second Tab id
    String SecondTabId = driver.getWindowHandle();

    System.out.println("second Tab ID " +SecondTabId);


    //open 3rd tab and switch to flipkart website
    driver.switchTo().newWindow(WindowType.TAB);

    driver.get("https://www.flipkart.com/");

    System.out.println("third tab id"+driver.getWindowHandle());

    System.out.println(driver.getTitle());

    //switch to first tab
    driver.switchTo().window(firstTabId);

    //get all tab ids
    Set<String> allIds =driver.getWindowHandles();

    for (String id : allIds){
        System.out.println(id);
    }

    driver.quit();
    }
}
