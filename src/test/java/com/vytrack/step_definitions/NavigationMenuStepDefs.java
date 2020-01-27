package com.vytrack.step_definitions;


import io.cucumber.java.en.Then;

public class NavigationMenuStepDefs {
    @Then("go to Fleet -> Vehicles module")
    public void go_to_Fleet_Vehicles_module() {
        System.out.println("navigate to vehicles module");
    }
    @Then("compare vehicle urls")
    public void compare_vehicle_urls() {
        System.out.println("assert the vehicle urls");
    }
    @Then("go to Marketing—> Campaigns module")
    public void go_to_Marketing_Campaigns_module() {
        System.out.println("navigate to campaigns module");
    }
    @Then("compare campaigns urls")
    public void compare_campaigns_urls() {
        System.out.println("compare campaigns urls");
    }
    @Then("go to Activities—> Calendar Events module")
    public void go_to_Activities_Calendar_Events_module() {
        System.out.println("navigate to calendar events module");
    }
    @Then("compare calendar events urls")
    public void compare_calendar_events_urls() {
        System.out.println("compare calendar events urls");
    }
}
