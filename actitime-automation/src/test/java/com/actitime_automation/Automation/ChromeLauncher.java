package com.actitime_automation.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLauncher {
    public static void main(String[] args){

        //1.create a browser instance
        WebDriver driver = new ChromeDriver();

        //2. open the website through the link
        driver.get("https://www.youtube.com/watch?v=h4J58ZAWMW4");

        //3. get title name in the console
        System.out.println(driver.getTitle());

        //close the window
        driver.close();
    }
}
