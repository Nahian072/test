package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistrationStep {
    public static WebDriver driver;
    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace\\Jenkins_Setup\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://abc9262.sg-host.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String username) {
//        driver.findElement(By.xpath("//*[@id='customer_login']//div[2]/form/p/input[@name='username']")).sendKeys(username);

        WebDriverWait wait = new WebDriverWait(driver,30);
WebElement username_element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='customer_login']//div[2]/form/p/input[@name='username']")));

username_element.sendKeys(username);
    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String email) {
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys(email);
    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String password) {
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys(password);
    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();
    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {
        WebElement dashboardText = driver.findElement(By.linkText("Dashboard"));
        String dashboardTextValue = dashboardText.getText();

        if (dashboardTextValue.equals("Dashboard")) {
            System.out.println("Verification Passed: Dashboard text is displayed.");
        } else {
            System.out.println("Verification Failed: Dashboard text is not displayed.");
        }
    }

}
