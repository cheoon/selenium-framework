package com.testing.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeSteps {
    @Given("I am on create an account pages")
    public void iAmOnCreateAnAccountPages() {
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String firstname, String lastname, String email, String password, String confirmpassword) {
    }

    @And("I click on create an accounts")
    public void iClickOnCreateAnAccounts() {
    }

    @Then("My account page is displaye")
    public void myAccountPageIsDisplaye() {
    }
}
