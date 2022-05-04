package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CellPhonePage extends Utility {
    By cellPhonesText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listIcon = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");

    public void verifyCellPhonesText(){
        verifyText("Cell phones", cellPhonesText, "Error, Cell phones text not displayed as expected");
    }
    public void clickOnListIcon(){
        clickOnElement(listIcon);
    }
    public void clickOnNokiaLumia(){
        sendKeysToElement(nokiaLumia, Keys.ENTER);
    }
}
