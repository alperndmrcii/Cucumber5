package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = true // true olduğunda testi çalıştırmaz sadece featurelara ait steplerin arlığını kontrol eder

)
public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
