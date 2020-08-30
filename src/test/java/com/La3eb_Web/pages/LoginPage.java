package com.La3eb_Web.pages;

import com.La3eb_Web.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="username")
    public WebElement userName;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    @FindBy(linkText = "Don't have an La3eb account? Create one now.")
    public WebElement Signup;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }


}
