package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace\\Jenkins_Setup\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
