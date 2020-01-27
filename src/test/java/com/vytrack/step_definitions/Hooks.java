package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE method");
    }

    @After
    public void tearDown(){
        System.out.println("\tthis is coming from AFTER method\n");
    }

    @After("@store_manager")
    public void tearDownStoreManager(){
        System.out.println("this is coming after store manager tests");
    }
}
