package com.actitime_automation.dec_18_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx2 {
    public static void main(String[] args) {

        System.out.println("** Program Starts **");

        String bName = "ch";
        String url = "https://demoqa.com/nestedframes";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        WebElement frameEle1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));  //1st frame web element
        driver.switchTo().frame(frameEle1);

        WebElement frameEle2 = driver.findElement(By.cssSelector("iframe[srcdoc]"));
        driver.switchTo().frame(frameEle2);

        String txt = driver.findElement(By.xpath("//body/p")).getText();
        System.out.println("TEXT : " + txt);

        driver.switchTo().parentFrame();        //immediate parent iframe tag

        driver.switchTo().defaultContent();





        System.out.println("** Program Ends **");


    }
}
