package com.actitime_automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FetchAllLinks {
    public static  void main (String[] args){

        //obj creation
        WebDriver driver = new ChromeDriver();

        //fetch url
        driver.get("https://www.flipkart.com/");

        //create array list
        List<String> color = new ArrayList<>();

        color.add("red");
        color.add("pink");
        color.add("blue");
        color.add("green");
        color.add("orange");

        for (String Value : color){
            System.out.println(color);
        }
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links in list"+links.size());

        for (WebElement element : links){

            String link = element.getAttribute("herf");
            System.out.println(link);
        }

        driver.close();


    }
}
