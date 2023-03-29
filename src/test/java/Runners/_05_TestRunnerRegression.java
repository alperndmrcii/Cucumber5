package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression or @SmokeTest",features = {"src/test/java/FeatureFiles"},glue = {"StepDefinitions"})
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}
