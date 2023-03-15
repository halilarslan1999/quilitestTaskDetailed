package com.PetStore.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
           },
        features = "src/test/resources/apiFeature",
        glue = "com/PetStore/stepDef",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {


}
