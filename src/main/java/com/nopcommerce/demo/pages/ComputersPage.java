package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By desktopLink = By.xpath("//img[@alt='Picture for category Desktops']");

    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }
}
