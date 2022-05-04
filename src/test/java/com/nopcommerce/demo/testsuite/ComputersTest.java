package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputersPage computersPg = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ThankYouPage thankYouPage = new ThankYouPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

        homePage.clickOnComputerLink();     // Click on computer link from homepage
        computersPg.clickOnDesktopLink();   // Click on desktop link on computers page
        desktopPage.clickOnSortByZToA();
        desktopPage.verifyProductAreInDescendingOrder();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputerLink();
        computersPg.clickOnDesktopLink();

        desktopPage.clickOnSortByAToZ();
        desktopPage.selectBuildYourComputer();

        buildYourOwnComputer.buildYourComputerText();
        buildYourOwnComputer.selectProcessor();
        buildYourOwnComputer.selectRam();
        buildYourOwnComputer.selectHdd();
        buildYourOwnComputer.selectOperatingSystem();
        buildYourOwnComputer.selectSoftware();
        buildYourOwnComputer.verifyPrice();
        buildYourOwnComputer.clickOnAddToCart();
        buildYourOwnComputer.shoppingCartAlert();
        buildYourOwnComputer.closeMessageAlert();
        buildYourOwnComputer.clickOnShoppingCart();

        shoppingCartPage.verifyShoppingCartText();
        shoppingCartPage.changeQuantity();
        shoppingCartPage.clickOnUpdataCart();
        shoppingCartPage.verifyTotal();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckout();

        signInPage.verifyWelcomeMessage();
        signInPage.clickOnGuestCheckout();

        checkoutPage.inputFirstName();
        checkoutPage.inputLastName();
        checkoutPage.inputEmail();
        checkoutPage.selectCountry();
        checkoutPage.inputCity();
        checkoutPage.inputPostalCode();
        checkoutPage.inputAddress1();
        checkoutPage.inputPhoneNumber();
        checkoutPage.clickOnContinueButton();
        checkoutPage.clickOnNextDayAirRadioButton();
        checkoutPage.clickOnContinueButtonAtShipping();
        checkoutPage.clickOnCreditCard();
        checkoutPage.clickOnContinueAtPayment();

        checkoutPage.inputCardHolderName();
        checkoutPage.inputCardNumber();
        checkoutPage.inputExpireMonth();
        checkoutPage.inputExpireYear();
        checkoutPage.inputCardCode();
        checkoutPage.clickOnContinueAtPaymentInfo();

        checkoutPage.verifyPaymentMethodText();
        checkoutPage.verifyCreditCardText();
        checkoutPage.verifyShippingMethodText();
        checkoutPage.verifyNextDayAirText();
        checkoutPage.verifyPriceTotalText();
        checkoutPage.clickOnConfirmButton();

        thankYouPage.verifyThankYouText();
        thankYouPage.verifyOrderSuccessText();
        thankYouPage.clickOnContinueButton();

        homePage.verifyWelcomeText();

    }
}
