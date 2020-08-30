package com.La3eb_Web.pages;

import com.La3eb_Web.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.linkText;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy( linkText="Please sign in")
    public WebElement SigninBtn;



}
