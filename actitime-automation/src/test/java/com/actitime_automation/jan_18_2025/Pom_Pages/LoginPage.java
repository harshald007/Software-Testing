package com.actitime_automation.jan_18_2025.Pom_Pages;

import org.example.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GenericUtility {

    private WebDriver driver;

    //Webelements
    @FindBy(name = "username")
    private WebElement userNameTextField;

    @FindBy(name = "pwd")
    private WebElement passwordTxtField;

    @FindBy(css = "#loginButton")
    private WebElement LoginBtn;

    @FindBy(css = "a[class='content tt_selected selected'] div[class='label']")
    private WebElement selectedTimeTrackTab;

    //Constructor
    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Page Action Method
    public void EnterUserName(String uName) {
        userNameTextField.sendKeys(uName);
    }

    public void enterPassword(String pwd) {
        userNameTextField.sendKeys(pwd);
    }

    public void ClickOnLoginBtn() {
        LoginBtn.click();
    }

    public boolean isSelectedTimeTrackTabDisplayed() {
        return isElementPresent(selectedTimeTrackTab);
    }




}
