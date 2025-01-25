package com.actitime_automation.dec_11_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClearSendKeysEx {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Program start ");

        String bName = "ch";
        String url = "https://demoqa.com/webtables";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div//span[@title='Edit']/*")).click();
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.clear();
        firstname.sendKeys("harshal");
        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
        Submit.click();



//        firstname.click();
//        Thread.sleep(2000);
//        firstname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//        Thread.sleep(2000);
//        firstname.sendKeys(Keys.DELETE);        //delete the selected text
//        Thread.sleep(2000);
//        firstname.sendKeys("Akshay");
//        System.out.println("** Program Ends **");


    }
}
