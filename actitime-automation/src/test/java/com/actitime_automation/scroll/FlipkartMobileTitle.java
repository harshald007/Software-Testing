package com.actitime_automation.scroll;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class FlipkartMobileTitle {
    public static void main(String[] args){
        System.out.println("Program starts here");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.flipkart.com/");

        driver.findElement(By.name("q")).sendKeys("mobiles");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

//        try {
//            WebElement closepopup = driver.findElement(By.xpath("//div/a[@class='wsejfv']"));
//            closepopup.click();
//        }catch (Exception e){
//            System.out.println("login popuo not dispaly");
//        }

        List<WebElement> mobileName = driver.findElements(By.xpath("//div[contains(@class, 'KzDlHZ')]"));
        List<WebElement> mobileprice = driver.findElements(By.xpath("//div[contains(@class, 'Nx9bqj _4b5DiR')]"));

        for (int i=0; i<mobileName.size(); i++){
            String name = mobileName.get(i).getText();
            String price = mobileprice.get(i).getText();
            System.out.println("mobile Name"+ name + "| mobile price" + price );
        }

        driver.findElement(By.xpath("//a[span='Next']")).click();







    }
}
