package com.actitime_automation.dec_23_2024;

import org.example.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUploadSendKeysEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Program Start ***");
        String bName = "ch";
        String url = "https://demoqa.com/automation-practice-form";
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(bName,url);

        gu.scrollByPageDown(driver,1);

        WebElement uploadbtn = driver.findElement(By.id("uploadPicture"));

        String path = System.getProperty("user.dir");
        //uploadBtn.sendKeys("./FileUploads/UploadData.txt");       //Exception due to Relative path

//        System.out.println("Path : "+ path);
        uploadbtn.sendKeys(path + "./FileUploads/UploadData.txt");    //Absolute Path


        System.out.println("*** Program End ***");

    }
}
