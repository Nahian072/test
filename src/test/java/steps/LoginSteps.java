package steps;

import io.cucumber.java.en.*;
import pages.DashboardPage;
import pages.MyAccountPage;

public class LoginSteps {
    MyAccountPage lp;
    DashboardPage dp;
public LoginSteps(){
     lp=new MyAccountPage();
     dp=new DashboardPage();
}

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
lp.OpenChromeBrowser();

    }
    @When("I enter valid username and Passwrd")
    public void i_enter_valid_username_and_passwrd() {
    lp.enterValidUserNameAndPassword();

    }
    @When("I click on the Login button")
    public void i_click_on_the_login_button() {
    lp.ClickOnLoginButton();

    }
    @Then("I should be landed to the admin dashboard page")
    public void i_should_be_landed_to_the_admin_dashboard_page() {
dp.verifyDashboardText();
    }
    @Then("I click on lout Drop down menu")
    public void i_click_on_lout_drop_down_menu() {
dp.clickOnLogOutDropDown();
    }
    @Then("I click on the Logout")
    public void i_click_on_the_logout() {
dp.clickOnLogOut();
    }
    @Then("I should be laned to the Login page")
    public void i_should_be_laned_to_the_login_page() {
  lp.verifyLoginText();
    }
    @Then("I close the browser")
    public void i_close_the_browser() {
    lp.CLoseChromeBrowser();
    }

    @When("I enter envalid credential")
    public void i_enter_envalid_credential() {
      lp.enterInvalidValidUserNameAndPassword();
    }

    @Then("I should see following message Invalid credentials")
    public void i_should_see_following_message_invalid_credentials() {
lp.verifyInvalidUserLoginmessage();
    }


}
