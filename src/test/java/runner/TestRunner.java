package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\workspace\\Jenkins_Setup\\src\\test\\resources\\Feautures\\login.feature",
        glue= {"steps"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {

        }
