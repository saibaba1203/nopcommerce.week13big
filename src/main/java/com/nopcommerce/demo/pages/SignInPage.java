package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By welcome = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By guestCheckout = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");


    public void verifyWelcomeMessage(){
        verifyText("Welcome, Please Sign In!",welcome,"Error, Welcome message not displayed as expected");
    }
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }
    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }
}
