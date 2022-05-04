package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By genderBtn = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By newsletter = By.id("Newsletter");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By registerSuccess = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");


    public void verifyRegisterText(){
        verifyText("Register", registerText, "Error, Register text not displayed as expected");
    }
    public void clickOnGenderRadioButton(){
        clickOnElement(genderBtn);
    }
    public void inputFirstName(){
        sendTextToElement(firstName,"Peter");
    }
    public void inputLastName(){
        sendTextToElement(lastName, "Patel");
    }
    public void inputEmail(){
        sendTextToElement(email, getRandomEmail());
    }
    public void clickOnNewsletterCheckbox(){
        clickOnElement(newsletter);
    }
    public void inputPassword(){
        sendTextToElement(password, "abc123");
    }
    public void inputConfirmPassword(){
        sendTextToElement(confirmPassword, "abc123");
    }
    public void clickRegisterButton(){
        clickOnElement(registerBtn);
    }
    public void verifyRegistrationCompleteText(){
        verifyText("Your registration completed", registerSuccess, "Error, Message not displayed as expected");
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
