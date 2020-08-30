package com.La3eb_Web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    @FindBy(name="username")
    public WebElement userName;

    @FindBy(name="password")
    public WebElement password;

}
