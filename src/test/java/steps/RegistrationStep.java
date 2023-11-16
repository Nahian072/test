package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class RegistrationStep {
    public static MyAccountPage mp;
    public RegistrationStep(){
        mp= new MyAccountPage();
    }


    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        mp.OpenChromeBrowser();
    }

    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String username) {
      mp.enter_username(username);


    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String email) {
        mp.enter_email(email);
    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String password) {
      mp.enter_password(password);
    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        mp.ClickOnRegisterBtn();
    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {
//        WebElement dashboardText = driver.findElement(By.linkText("Dashboard"));
//        String dashboardTextValue = dashboardText.getText();
//
//        if (dashboardTextValue.equals("Dashboard")) {
//            System.out.println("Verification Passed: Dashboard text is displayed.");
//        } else {
//            System.out.println("Verification Failed: Dashboard text is not displayed.");
//        }
    }

        @When("I enter a weak Password {string}")
        public void i_enter_a_weak_password(String wp) {
        mp.i_enter_weak_password(wp);

        }
        @Then("I should see an error message for weak password")
        public void i_should_see_an_error_message_for_weak_password() throws InterruptedException {
        mp.i_validate_error_message_for_weak_password();

        }
    @When("I enter a esisting Username {string}")
    public void i_enter_a_esisting_username(String string) {
        mp.enter_esisting_username(string);

    }

    @Then("I should see an error message for esisting username")
    public void i_should_see_an_error_message_for_esisting_username() throws InterruptedException {
       mp.i_validate_error_message_for_existing_user_name();
    }

    }


