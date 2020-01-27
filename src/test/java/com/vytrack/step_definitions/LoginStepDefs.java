package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
     @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
         System.out.println("I opened the browser and navigate to qa3.vytrack.com");

    }

    @When("the users enter the driver info")
    public void the_users_enter_the_driver_info() {
        System.out.println("I entered user1 and UserUser123");

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verified that I see the dashboard page");

    }
    @When("the user enters the sales manager info")
    public void the_user_enters_the_sales_manager_info() {
        System.out.println("I entered as a sales manager");
    }

    @When("the user enters the store manager info")
    public void the_user_enters_the_store_manager_info() {
        System.out.println("I entered store manager123 and UserUser123 click enter");
    }





}
