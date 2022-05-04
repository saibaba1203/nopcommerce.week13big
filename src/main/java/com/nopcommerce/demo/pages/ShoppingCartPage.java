package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {
    By shoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//input[contains(@id, 'itemquantity')]");
    By updateCart = By.xpath("//button[text()='Update shopping cart']");
    By total = By.className("product-subtotal");
    By termsOfService = By.id("termsofservice");
    By checkoutBtn = By.id("checkout");
    By quantityValue = By.xpath("//span[contains(text(),'(2)')]");
    By totalPrice = By.xpath("//span[contains(text(),'$698.00')]");

    public void verifyShoppingCartText() {
        verifyText("Shopping cart", shoppingCart, "Error, message not displayed as expected");
    }

    public void changeQuantity() {
        sendKeysToElement(quantity, Keys.BACK_SPACE + "2");
    }
    public void clickOnUpdataCart(){
        clickOnElement(updateCart);
    }
    public void verifyTotal(){
        verifyText("$2,950.00",total,"Error, total not dispalyed as expected");
    }
    public void clickOnTermsOfService(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckout(){
        clickOnElement(checkoutBtn);
    }
    public void verifyQuantityValue(){
        verifyText("(2)", quantityValue, "Error, quantity value not displayed as expected");
    }
    public void verifyTotalPriceValue(){
        verifyText("$698.00", totalPrice, "Error, Total price not as expected");
    }
}
