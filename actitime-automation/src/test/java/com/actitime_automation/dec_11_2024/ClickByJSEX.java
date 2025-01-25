package com.actitime_automation.dec_11_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJSEX {
    public static void main(String[] args) throws InterruptedException {
       /* String bName = "ch";
        String url = "https://demoqa.com/radio-button";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName, url);



//        yesRadioBtn.click();      //won't work, below is alternative using javascript
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));


//        type casting, so js will perform operation on same browser
        js.executeScript("arguments[0].click();",yesRadioBtn);
        System.out.println("Clicked on Yes radio button.");
        System.out.println("** Program Ends **");
*/




        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('yesRadio').click();");
        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
        if (yesRadioBtn.isSelected()){
            System.out.println(" yes button is selected");
        }else
        {

            System.out.println(" yes button is not selected");
        }
    }

}
