package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicTest extends TestBase {
    HomePage homePage = new com.nopcommerce.demo.pages.HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ThankYouPage thankYouPage = new ThankYouPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        homePage.mouseHoverOnElectronics();
        homePage.clickOnCellPhone();
        cellPhonePage.verifyCellPhonesText();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        verifyUserShouldNavigateToCellPhonesPageSuccessfully();
        cellPhonePage.verifyCellPhonesText();
        cellPhonePage.clickOnListIcon();
        cellPhonePage.clickOnNokiaLumia();

        nokiaLumiaPage.verifyNokiaLumiaText();
        nokiaLumiaPage.verifyNokiaLumiaPrice();
        nokiaLumiaPage.updateQuantity();
        nokiaLumiaPage.clickOnAddToCartButton();
        nokiaLumiaPage.verifyAlertText();
        nokiaLumiaPage.clickOnCloseAlertIcon();
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        nokiaLumiaPage.clickOnGoToCartButton();

        shoppingCartPage.verifyShoppingCartText();
        shoppingCartPage.verifyQuantityValue();
        shoppingCartPage.verifyTotalPriceValue();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckout();

        signInPage.verifyWelcomeMessage();
        signInPage.clickOnRegisterButton();

        registerPage.verifyRegisterText();
        registerPage.clickOnGenderRadioButton();
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputEmail();
        registerPage.clickOnNewsletterCheckbox();
        registerPage.inputPassword();
        registerPage.inputConfirmPassword();
        registerPage.clickRegisterButton();
        registerPage.verifyRegistrationCompleteText();
        registerPage.clickOnContinueButton();

        shoppingCartPage.verifyShoppingCartText();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckout();

        checkoutPage.inputFirstName();
        checkoutPage.inputLastName();
        checkoutPage.selectCountry();
        checkoutPage.inputCity();
        checkoutPage.inputPostalCode();
        checkoutPage.inputAddress1();
        checkoutPage.inputPhoneNumber();
        checkoutPage.clickOnContinueButton();
        checkoutPage.clickOnTwoDayAirRadioButton();
        checkoutPage.clickOnContinueButtonAtShipping();
        checkoutPage.clickOnCreditCard();
        checkoutPage.clickOnContinueAtPayment();
        checkoutPage.selectVisaCreditCard();
        checkoutPage.inputCardHolderName();
        checkoutPage.inputCardNumber();
        checkoutPage.inputExpireMonth();
        checkoutPage.inputExpireYear();
        checkoutPage.inputCardCode();
        checkoutPage.clickOnContinueAtPaymentInfo();
        checkoutPage.verifyPaymentMethodText();
        checkoutPage.verifyCreditCardText();
        checkoutPage.verifyShippingMethodText();
        checkoutPage.verifyTwoDayAirText();
        checkoutPage.verifyNokiaPriceTotal();
        checkoutPage.clickOnConfirmButton();

        thankYouPage.verifyThankYouText();
        thankYouPage.verifyOrderSuccessText();
        thankYouPage.clickOnContinueButton();

        homePage.verifyWelcomeText();
        homePage.clickOnLogout();
        homePage.verifyUrl();

    }
}
