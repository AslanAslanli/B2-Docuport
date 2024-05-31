package app.docuport.step_definitions.selenium_tasks;

import app.docuport.pages.Docuport.LoginPage;
import app.docuport.utilities.Driver;
import io.cucumber.java.en.*;

import javax.swing.*;
import java.util.Map;

public class Day01_task_1 {
    LoginPage loginPage
    @Given("the user lands on the Docuport login page at {string}")
    public void the_user_lands_on_the_Docuport_login_page_at(String url) {
        Driver.getDriver().get(url);
    }

    @When("the user logs in with the following credentials:")
    public void the_user_logs_in_with_the_following_credentials(Map<String, String> loginCredentials) {


    }

    @Then("the user should see the dashboard indicating a successful login")
    public void the_user_should_see_the_dashboard_indicating_a_successful_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("validate user is redirected to the login page")
    public void validate_user_is_redirected_to_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
