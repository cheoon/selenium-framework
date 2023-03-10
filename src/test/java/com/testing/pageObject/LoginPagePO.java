package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {

    // Element locators - Stage 1

    @FindBy(id = "email")
    public static  WebElement EmailField;
    @FindBy(id = "pass")
    public static WebElement PassField;
    @FindBy(id = "send2")
    public static WebElement SignInButton;


    // Initialise Web Elements to use Selenium - Stage 2
    public LoginPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void enterEmail(String email){
        EmailField.sendKeys(email);
    }
    public void enterPassword(String password) {
        PassField.sendKeys(password);
    }
    public void  clickSignButton(){
        SignInButton.click();
    }


}
