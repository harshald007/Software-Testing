package com.actitime_automation.jan_08_2025;

import org.example.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParaEx3 {
    @Test
    public void googleEx(){
        System.out.println("*** google start ***");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://demo.automationtesting.in/Register.html");
        System.out.println("*** google stop ***");
        driver.quit();
    }

}
