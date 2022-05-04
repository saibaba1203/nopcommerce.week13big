package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    By sortBy = By.id("products-orderby");
    By addToCart = By.xpath("//a[contains(text(),'Build your own computer')]");
    By productTitle = By.xpath("//h2[@class='product-title']");


    public void clickOnSortByZToA(){
        selectByVisibleTextFromDropdown(sortBy,"Name: Z to A");
    }
    public void clickOnSortByAToZ(){
        selectByVisibleTextFromDropdown(sortBy,"Name: A to Z");
    }
    public void selectBuildYourComputer(){
        sendKeysToElement(addToCart, Keys.ENTER);
    }

    public void verifyProductAreInDescendingOrder(){
        List<WebElement> originalList = driver.findElements(productTitle);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product :originalList){
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);
        System.out.println(originalProductNameList);

        //Sort by position "Name: A to Z"
        selectByVisibleTextFromDropdown(sortBy, "Name: Z to A");

       // waitUnitVisibilityOfElementLocated(By.xpath("//h2[@class='product-title']"),10);

        List<WebElement> afterSortingList = driver.findElements(productTitle);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product :afterSortingList){
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);

        Assert.assertEquals("Product not sorted", originalProductNameList, afterSortingProductName);

    }
}
