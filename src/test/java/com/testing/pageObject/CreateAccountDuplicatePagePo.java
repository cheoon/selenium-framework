package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountDuplicatePagePo {

    // Element locators - Stage 1


    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement Email_AddressField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static  WebElement PasswordConfirmationField;

    @FindBy(id = "create-account")
    public static WebElement CreateAccount;

    // Initialise Web Elements to use Selenium - Stage 2
    public CreateAccountDuplicatePagePo(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    // Page Specific Methods
    public void enterFirstName(String firstname){
        FirstNameField.sendKeys(firstname);

    }
    public void enterLastName(String lastname){
        LastNameField.sendKeys(lastname);

    }
    public void  enterEmailAddress(String email){
        Email_AddressField.sendKeys(email);
    }

    public void enterPassword(String password){
        PasswordField.sendKeys(password);

    }
    public void  enterPasswordConfirmation(String passwordconfirmation){
        PasswordConfirmationField.sendKeys(passwordconfirmation);
    }

    public void  clickCreateAccountButton(){

    }





































}
