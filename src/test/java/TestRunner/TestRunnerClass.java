package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "All Feature Files" }, glue = { "Steps" }, dryRun = false)
public class TestRunnerClass extends AbstractTestNGCucumberTests {

}
