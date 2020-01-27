package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        //where our feature files are located
        features = "src/test/resources/features/",
        glue = "com/vytrack/step_definitions",
        //dryRun false, shows all the defined steps, true shows undefined
        dryRun = false,
        tags = "@VYT-123"

)
public class CukesRunner {



}
