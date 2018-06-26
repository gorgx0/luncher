package com.luncher;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/cucumber"},
        glue = {"src/test/groovy/cucumber"}
)
public class CukeRunner {
}
