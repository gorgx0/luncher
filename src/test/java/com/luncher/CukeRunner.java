package com.luncher;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/resources/cucumber"},
        glue = {"src/test/groovy/cucumber"},
        plugin = {
                "pretty",
                "html:build/reports/tests/cucumber",
                "json:build/reports/tests/cucumber/result.json",
                "junit:build/reports/tests/cucumber/result.xml"
        },
        snippets = SnippetType.CAMELCASE
)
public class CukeRunner {
}
