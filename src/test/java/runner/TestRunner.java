package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\MyWorkspace\\CucumberJavaDemo1\\src\\test\\resources\\Feautures\\login.feature",
        glue= "steps",
        tags = "@smoke",
        plugin = {"json:target/cucumber.json"})
public class TestRunner {

        }
