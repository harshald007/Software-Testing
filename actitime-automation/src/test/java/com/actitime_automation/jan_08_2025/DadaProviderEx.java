package com.actitime_automation.jan_08_2025;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



class Parent1{
        @DataProvider
        public Object[][] getLoginCredentials(){
            Object[][] ar = new Object[4][2];

            ar[0][0] ="admin";
            ar[0][1] ="manager";

            ar[1][0] ="admin123";
            ar[1][1] ="manager123";

            ar[2][0] ="admin23";
            ar[2][1] ="manager21";

            ar[3][0] ="admin24";
            ar[3][1] ="admin2";

            return ar;
        }
}
public class DadaProviderEx extends Parent1 {
    /*@DataProvider
    public Object[][] getLoginCredentials(){
        Object[][] ar = new Object[4][2];

        ar[0][0] ="admin";
        ar[0][1] ="manager";

        ar[1][0] ="admin123";
        ar[1][1] ="manager123";

        ar[2][0] ="admin23";
        ar[2][1] ="manager21";

        ar[3][0] ="admin24";
        ar[3][1] ="admin2";

        return ar;
    }*/
    @Test(dataProvider = "getLoginCredentials")
    public void LoginTC(String uName, String pwd) {
        System.out.println("*** program Start ***");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch", "http://127.0.0.1:83/login.do");
        driver.findElement(By.name("username")).sendKeys(uName);
        driver.findElement(By.name("pwd")).sendKeys(pwd);
        driver.findElement(By.cssSelector("#LoginButton")).click();
        gu.waitForVisibilityByType(driver, 30, "id", "logoutlink");
        driver.findElement(By.id("logoutLink")).click();
        System.out.println("*** program Stop ***");
    }
}
