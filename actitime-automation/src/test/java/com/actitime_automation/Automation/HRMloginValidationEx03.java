package com.actitime_automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMloginValidationEx03 {
    public static void main (String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);

        Thread.sleep(5000);

        //1.get login button from element from web-page
        WebElement button = driver.findElement(By.xpath("//div/button[@ type='submit']"));
        System.out.println(button);

        // 2. check if the button is displayed or not
        if (button.isDisplayed()){
            if (button.isEnabled()){
                button.click();
            }
            else
            {
                throw new Exception("Button is not enabled hence closing the test!!");
            }
        }
        else
        {
            Thread.sleep(5000);
                button.click();
        }
        // 3. find the error message for username and password
        String userError = driver.findElement(By.xpath("//input[@name='username']/following::span[1]")).getText();
        String passError = driver.findElement(By.xpath("//input[@name='username']/following::span[2]")).getText();

        // 4. check if the error message for username and password is valid or not
        if (userError.equals("Required")){
            System.out.println("Error for username verified!!");
        }
        else
        {
            System.out.println("Error for username is invalid!!");
        }


        if (passError.equals("Required")){
            System.out.println("Error for password verified");
        }
        else
        {
            System.out.println("Error for password is invalid!!");
        }

        // 5. close the current window/tab
        Thread.sleep(5000);
        driver.close();
    }
}
