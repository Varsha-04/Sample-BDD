package test.java.testRunner;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = {"test.java.StepDefinitions"},
        features = {"src/test/resources/features/"}
)
public class TestRunner {
}
