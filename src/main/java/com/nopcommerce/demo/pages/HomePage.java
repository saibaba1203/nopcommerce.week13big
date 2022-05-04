package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By computerLink = By.xpath("//a[@href='/computers']");
    By computersPage = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsPage = By.xpath("//h1[contains(text(),'Electronics')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By apparelPage = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsPage = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksPage = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryPage = By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsPage = By.xpath("//h1[contains(text(),'Gift Cards')]");


    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public void verifyComputersText() {
        verifyText("Computers", computersPage, "Computers page is not displayed");
    }
    public void verifyElectronicsText() {
        verifyText("Electronics", electronicsPage, "Electronics page is not displayed");
    }
    public void verifyApparelText() {
        verifyText("Apparel", apparelPage, "Apparel page is not displayed");
    }
    public void verifyDigitalDownloadsText() {
        verifyText("Digital downloads", digitalDownloadsPage, "Digital Downloads page is not displayed");
    }

    public void verifyBooksText() {
        verifyText("Books", booksPage, "Books page is not displayed");
    }

    public void verifyJewelryText() {
        verifyText("Jewelry", jewelryPage, "Jewelry page is not displayed");
    }
    public void verifyGiftCardsText() {
        verifyText("Gift Cards", giftCardsPage, "GiftCards page is not displayed");
    }


    public void clickOnComputerAndVerifyText(){
        clickOnComputerLink();
        verifyText("Computers", computersPage, "");
    }
    public void clickOnComputerLink(){
        clickOnElement(computerLink);
    }


    By cellPhoneLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");

    public void mouseHoverOnElectronics() {
        mouseHover(electronicsLink);
    }
    public void clickOnCellPhone(){
        mouseHoverAndClick(cellPhoneLink);
    }


    By welcome = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logout = By.xpath("//a[contains(text(),'Log out')]");

    public void verifyWelcomeText(){
        verifyText("Welcome to our store", welcome, "Error, Welcome message not displayed as expected");
    }
    public void clickOnLogout(){
        clickOnElement(logout);
    }
    public void verifyUrl(){
        String url= driver.getCurrentUrl();
        Assert.assertEquals(url, "https://demo.nopcommerce.com/");
    }
}
