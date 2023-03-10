package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.LoginPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {

    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();

    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String firstname, String lastname, String email, String password, String confirmpassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(firstname);
        createAccountPagePO.enterLastName(lastname);
        createAccountPagePO.enterEmail_Address(email);
        createAccountPagePO.enterPassword(password);
        createAccountPagePO.enterPasswordConfirmation(confirmpassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();


    }

    @Then("My account page is display")
    public void myAccountPageIsDisplay() {
    }

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();

    }

    @When("I enter my {string} and {string}")
    public void iEnterMyAnd(String email, String password) {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.enterEmail(email);
        loginPagePO.enterPassword(password);


    }


    @And("I click on sign in")
    public void iClickOnSignIn() {
        LoginPagePO loginPagePO = new LoginPagePO(driver);
        loginPagePO.clickSignButton();

    }


}
