package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\nafas\\Desktop\\Clone\\Aurnob\\REST_API\\AmazonBDD\\src\\main\\java\\features"},
        glue={"stepDefinitions"},
        format = {"pretty","json:report/cucumber.json","html:report/cucumber-pretty"},
        strict = false,
        monochrome = true,
        tags = {"@many"},
        dryRun = true )



public class TestRunner {
}
