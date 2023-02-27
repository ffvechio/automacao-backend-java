package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features/01-Login.feature",},
        glue = {"stepdefinition", "commons"},
        tags = "@login",
        dryRun = false,
        monochrome = true)
public class RunnerTest {
}