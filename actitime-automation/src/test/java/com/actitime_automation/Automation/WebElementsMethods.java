package com.actitime_automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {
    public static void main (String[] args) throws InterruptedException {


        boolean redCeckbox;

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

        WebElement redCheckbox = driver.findElement(By.xpath("//input[@value = 'red']"));
        redCheckbox.click();

        if (redCheckbox.isSelected())
        {
            System.out.println("is selected ");
        }
        else
        {
            System.out.println("is not selected");
        }


        //by Using object creation

        //boolean redCheckbox;

        //WebDriver driver1 = new ChromeDriver();

        redCheckbox = driver.findElement(By.xpath("//input[@value='red']"));

        System.out.println(redCheckbox);

        driver.findElement(By.xpath("//input[@value='red']")).click();

        redCheckbox = driver.findElement(By.xpath("//input[@value='red']"));

        System.out.println(redCheckbox);


        driver.get("https://www.redbus.in/");

        String srcValue = driver.findElement(By.xpath("//img[contains(@title,'online Bus']")).getAttribute("src");

        System.out.println("srcValue");

        Thread.sleep(5000);



    }
}
