package com.actitime_automation.jan_08_2025;

import org.example.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParaEx1 {
    @Test
    public void googleEx(){
        System.out.println("*** google start ***");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://www.google.com/");
        System.out.println("*** google stop ***");
        driver.quit();
    }

    @Test
    public void facebookEx(){
        System.out.println("*** facebook start ***");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://www.facebook.com/");
        System.out.println("*** facebook stop ***");
        driver.quit();
    }
}
