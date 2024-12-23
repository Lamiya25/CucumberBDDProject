package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features/registerFlow",
        glue = "stepDefinitions",
        // tags = "@wip",
        dryRun = false // true- to generate methods for step definition classes
)
public class TestRunner {
    // It's an empty class
    // This class is used for build project
    // And run feature files
    // command for run: mvn clean verify
}