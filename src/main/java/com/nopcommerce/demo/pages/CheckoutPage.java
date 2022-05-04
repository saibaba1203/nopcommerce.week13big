package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By postalcode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continu = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAir = By.id("shippingoption_1");
    By twoDayAir = By.id("shippingoption_2");
    By shipContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");


    //****** Checkout Page Shipping Information *********//
    public void inputFirstName(){
        sendTextToElement(firstName,"Peter");
    }
    public void inputLastName(){
        sendTextToElement(lastName,"Patel");
    }
    public void inputEmail(){
        sendTextToElement(email,"acb@gmail.com");
    }
    public void selectCountry(){
        selectByVisibleTextFromDropdown(country,"United Kingdom");
    }
    public void inputCity(){
        sendTextToElement(city,"London");
    }
    public void inputPostalCode(){
        sendTextToElement(postalcode,"SW1A 2AA");
    }
    public void inputAddress1(){
        sendTextToElement(address1,"10 Downing Street");
    }
    public void inputPhoneNumber(){
        sendTextToElement(phoneNumber,"02082228899");
    }
    public void clickOnContinueButton(){
        clickOnElement(continu);
    }
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(nextDayAir);
    }
    public void clickOnContinueButtonAtShipping(){
        clickOnElement(shipContinue);
    }
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }
    public void clickOnContinueAtPayment(){
        clickOnElement(paymentContinue);
    }
    public void clickOnTwoDayAirRadioButton(){
        clickOnElement(twoDayAir);
    }

    //****** Checkout Page Payment Information *********//

    By creditCardType = By.id("CreditCardType");
    By cardHoldername = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueAtPayInfo = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void inputCreditCard(){
        selectByVisibleTextFromDropdown(creditCardType,"Master card");
    }
    public void inputCardHolderName(){
        sendTextToElement(cardHoldername,"Peter Patel");
    }
    public void inputCardNumber(){
        sendTextToElement(cardNumber,"5356 6548 1418 5420");
    }
    public void inputExpireMonth(){
        selectByVisibleTextFromDropdown(expireMonth,"11");
    }
    public void inputExpireYear(){
        selectByVisibleTextFromDropdown(expireYear,"2022");
    }
    public void inputCardCode(){
        sendTextToElement(cardCode,"123");
    }
    public void clickOnContinueAtPaymentInfo(){
        clickOnElement(continueAtPayInfo);
    }
    public void selectVisaCreditCard(){
        selectByVisibleTextFromDropdown(creditCardType,"Visa");
    }


    //****** Checkout Page Confirm Order *********//

    By paymentMethodText = By.xpath("//span[contains(text(),'Payment Method:')]");
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethodText = By.xpath("//span[contains(text(),'Shipping Method:')]");
    By nextDayAirText = By.xpath("//span[contains(text(),'Next Day Air')]");
    By twoDayAirShip = By.xpath("//span[contains(.,'2nd Day Air')]");
    By priceTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By nokiaPriceTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirmBtn = By.xpath("//button[contains(text(),'Confirm')]");

    public void verifyPaymentMethodText() {
        verifyText("Payment Method:", paymentMethodText, "Error, messsage not dispalyed as expected");
    }
    public void verifyCreditCardText(){
        verifyText("Credit Card", creditCardText, "Error, messsage not dispalyed as expected");
    }
    public void verifyShippingMethodText(){
        verifyText("Shipping Method:", shippingMethodText, "Error, messsage not dispalyed as expected");
    }
    public void verifyNextDayAirText(){
        verifyText("Next Day Air", nextDayAirText, "Error, messsage not dispalyed as expected");
    }
    public void verifyPriceTotalText(){
        verifyText("$2,950.00", priceTotal, "Error, messsage not dispalyed as expected");
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmBtn);
    }
    public void verifyTwoDayAirText(){
        verifyText("2nd Day Air", twoDayAirShip, "Error, 2nd Day Air not displayed as expected");
    }
    public void verifyNokiaPriceTotal(){
        verifyText("$698.00", nokiaPriceTotal, "Error, $698.00 total not displayed as expected");
    }
}
