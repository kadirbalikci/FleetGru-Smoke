package com.La3eb_Web.step_definitions;

import com.La3eb_Web.pages.HomePage;
import com.La3eb_Web.pages.LoginPage;
import com.La3eb_Web.utilities.BrowserUtils;
import com.La3eb_Web.utilities.ConfigurationReader;
import com.La3eb_Web.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.get().manage().window().maximize();
    }

    @When("User enters valid info for registration")
    public void user_enters_valid_info_for_registration() {
      homePage.SigninBtn.click();

//        Driver.get().findElement(By.name("email")).clear();
//        Driver.get().findElement(By.name("email")).sendKeys("kadirbalikci@gmail.com");
       loginPage.userName.clear();
        loginPage.userName.sendKeys("kadirbalikci");
        loginPage.password.clear();
        loginPage.password.sendKeys("987D412w");
//        Driver.get().findElement(By.name("confirmPassword")).clear();
//        Driver.get().findElement(By.name("confirmPassword")).sendKeys("987D412w");
//        Driver.get().findElement(By.id("gender")).click();
//                new Select(Driver.get().findElement(By.id("gender"))).selectByVisibleText("m");
//        Driver.get().findElement(By.id("gender")).click();
//        Driver.get().findElement(By.name("dateOfBirth")).click();
//        Driver.get().findElement(By.name("dateOfBirth")).clear();
//        Driver.get().findElement(By.name("dateOfBirth")).sendKeys("0001-03-03");
//        Driver.get().findElement(By.name("dateOfBirth")).clear();
//        Driver.get().findElement(By.name("dateOfBirth")).sendKeys("0019-03-03");
//        Driver.get().findElement(By.name("dateOfBirth")).clear();
//        Driver.get().findElement(By.name("dateOfBirth")).sendKeys("0199-03-03");
//        Driver.get().findElement(By.name("dateOfBirth")).clear();
//        Driver.get().findElement(By.name("dateOfBirth")).sendKeys("1999-03-03");
//        Driver.get().findElement(By.name("legal")).click();
        Driver.get().findElement(By.cssSelector("button.btn.btn-primary.btn-xlg.btn-fill")).click();

        }





    //}

//    @When("the user enter the driver information")
//    public void the_user_enter_the_driver_information() throws InterruptedException {
//        LoginPage loginPage = new LoginPage();
//        String username = ConfigurationReader.get("driver_username");
//        String password = ConfigurationReader.get("driver_password");
//        loginPage.login(username,password);
//
//    }
//
//    @Then("the user should be able to login")
//    public void the_user_should_be_able_to_login() throws InterruptedException {
//
//        BrowserUtils.waitFor(2);
//        String actualTitle = Driver.get().getTitle();
//        Assert.assertEquals("Dashboard",actualTitle);
//
//
//    }
//
//
//
//    @When("user logs in using {string} and {string}")
//    public void user_logs_in_using_and(String username, String password) {
//        LoginPage loginPage = new LoginPage();
//        loginPage.login(username,password);
//    }
//
//    @Then("the title should contains {string}")
//    public void the_title_should_contains(String expectedTitle) {
//        BrowserUtils.waitFor(3);
//        System.out.println("expectedTitle = " + expectedTitle);
//        Assert.assertTrue("Actual title:"+Driver.get().getTitle(),Driver.get().getTitle().contains(expectedTitle));
//
//    }
//
//
    }



//}