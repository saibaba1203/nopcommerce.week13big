package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By buildYourComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hdd = By.id("product_attribute_3_7");
    By operatingSystem = By.id("product_attribute_4_9");
    By software = By.id("product_attribute_5_12");
    By price = By.xpath("//span[contains(text(),'$1,475.00')]");
    By addToCart = By.id("add-to-cart-button-1");
    By message = By.xpath("//p[contains(.,'The product has been added to your shopping cart')]");
    By closeMessage = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");


    public void buildYourComputerText(){
        verifyText("Build your own computer",buildYourComputer,"Error");
    }
    public void selectProcessor(){
        selectByVisibleTextFromDropdown(processor,"2.2 GHz Intel Pentium Dual-Core E2200");
    }
    public void selectRam(){
        selectByVisibleTextFromDropdown(ram,"8GB [+$60.00]");
    }
    public void selectHdd(){
        clickOnElement(hdd);
    }
    public void selectOperatingSystem(){
        clickOnElement(operatingSystem);
    }
    public void selectSoftware(){
        clickOnElement(software);
    }
    public void verifyPrice(){
        verifyText("$1,475.00",price,"Error, Price not displayed as expected");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void shoppingCartAlert(){
        verifyText("The product has been added to your shopping cart",message,"Error, Message not displayed as expected");
    }
    public void closeMessageAlert(){
        clickOnElement(closeMessage);
    }
    public void clickOnShoppingCart() throws InterruptedException {
        mouseHoverAndClick(shoppingCart);
    }
}
