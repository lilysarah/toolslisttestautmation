package co.uk.safebear;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {
    @Given("I am logged out")
    public void i_am_logged_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("i am logged in successfully")
    public void i_am_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I create a tool {string} and {string}")
    public void i_create_a_tool_and(String toolUse, String toolName) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("i can add the created tool to the list on the website")
    public void i_can_add_the_created_tool_to_the_list_on_the_website() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
