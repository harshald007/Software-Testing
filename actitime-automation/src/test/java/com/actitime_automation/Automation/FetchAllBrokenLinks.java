package com.actitime_automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class FetchAllBrokenLinks {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        //find all web element with tag name "a'
        List<WebElement> Links = driver.findElements(By.tagName("a"));

        System.out.println("Total links in List"+ Links.size());

        int count=0;
        for (WebElement Element : Links){
            String link = Element.getAttribute("herf");

            if (link != null && link.startsWith("https")){
                try {
                    //convert string into actual links
                    URL url = new URL(link);

                    //open socket connection to hit the url
                    URLConnection urlConnection = url.openConnection();

                    //type cast urlconnection into httpurlconnection
                    HttpURLConnection connection = (HttpURLConnection) urlConnection;

                    //hit url
                    connection.connect();

                    int statusCode = connection.getResponseCode();

                    if (statusCode != 200){
                        System.out.println("Status code"+statusCode+"url"+link);
                        count++;
                    }

                } catch (Exception e) {
                }
            }
        }
        System.out.println("Total broken urls: "+count);
        driver.close();


    }
}
