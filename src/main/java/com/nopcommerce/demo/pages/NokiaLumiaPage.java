package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility {
    By nokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By price = By.xpath("//span[contains(text(),'$349.00')]");
    By quantity = By.id("product_enteredQuantity_20");
    By addToCart = By.id("add-to-cart-button-20");
    By alertText = By.xpath("//p[contains(.,'The product has been added to your shopping cart')]");
    By closeAlert = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public void verifyNokiaLumiaText(){
        verifyText("Nokia Lumia 1020", nokiaLumiaText,"Error, message not displayed as expected");
    }
    public void verifyNokiaLumiaPrice(){
        verifyText("$349.00", price, "Error, message not displayed as expected");
    }
    public void updateQuantity(){
        sendKeysToElement(quantity, Keys.BACK_SPACE+"2");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }
    public void verifyAlertText(){
        verifyText("The product has been added to your shopping cart", alertText, "Error, message not displayed as expected");
    }
    public void clickOnCloseAlertIcon(){
        clickOnElement(closeAlert);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHover(shoppingCart);
    }
    public void clickOnGoToCartButton(){
        mouseHoverAndClick(goToCart);
    }
}
