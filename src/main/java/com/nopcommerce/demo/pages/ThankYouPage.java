package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ThankYouPage extends Utility {
    By thankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccess = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueBtn = By.xpath("//button[contains(text(),'Continue')]");


    public void verifyThankYouText(){
        verifyText("Thank you", thankYou, "Error, Thank you message not displayed as expected");
    }
    public void verifyOrderSuccessText(){
        verifyText("Your order has been successfully processed!", orderSuccess, "Error, message not displayed as expected");
    }
    public void clickOnContinueButton(){
        clickOnElement(continueBtn);
    }
}
