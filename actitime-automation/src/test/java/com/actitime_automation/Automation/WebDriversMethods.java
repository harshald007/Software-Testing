package com.actitime_automation.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriversMethods {
    public static void main(String[] args){

        //launch new browser
        WebDriver driver = new ChromeDriver();

        //navigate to the website
        driver.navigate().to("https://www.amazon.in/");

        //get the id of currently controlled tab
        String ParentId = driver.getWindowHandle();

        System.out.println(ParentId);

     /*   driver.navigate().refresh();

        driver.navigate().back();

        driver.navigate().forward();
     */

        //open new tab and switch the control
        driver.switchTo().newWindow(WindowType.WINDOW);

        //navigate toh redbus website
        driver.get("https://www.redbus.in/");

        //print the title of the red bus
        String redbusTitle = driver.getTitle();
        System.out.println(redbusTitle);

        //close browser instance
        driver.close();

        //switch new tab
        driver.switchTo().window(ParentId);

        //print title of the Url
        String amazonUrl = driver.getTitle();
        System.out.println(amazonUrl);

        //close browser instance
        driver.quit();
    }
}
