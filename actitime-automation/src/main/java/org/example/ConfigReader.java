package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.*;

public class ConfigReader {

    public Properties getPropObj() {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "\\ConfigurationDetails\\Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            return prop;

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getPropData(String key) {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "\\ConfigurationDetails\\Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            return prop.getProperty(key);

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /*public String test(String key) {
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
                    + "\\ConfigurationDetails\\Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return value;
    }*/
}