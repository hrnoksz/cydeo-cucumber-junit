package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", //we can write anything instead of "rerun"
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false, // to get snippets from the console, dryRun must be true
        tags = "@wip"
)

public class CukesRunner {
}
