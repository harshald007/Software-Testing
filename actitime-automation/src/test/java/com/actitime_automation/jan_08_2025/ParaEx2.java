package com.actitime_automation.jan_08_2025;

import org.example.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParaEx2 {
    @Test
    public void googleEx(){
        System.out.println("*** Demoqa start ***");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://demoqa.com/");
        System.out.println("*** google stop ***");
        driver.quit();
    }

    @Test
    public void facebookEx(){
        System.out.println("*** Flipkart start ***");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://www.flipkart.com/");
        System.out.println("*** facebook stop ***");
        driver.quit();
    }
}
