package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void navigateToComputerPageandVerifyText(){
        homePage.selectMenu("Computers");
        homePage.verifyComputersText();
    }
    @Test
    public void navigateToElectronicsPageandVerifyText(){
        homePage.selectMenu("Electronics");
        homePage.verifyElectronicsText();
    }
    @Test
    public void navigateToApparelPageandVerifyText() {
        homePage.selectMenu("Apparel");
        homePage.verifyApparelText();
    }
    @Test
    public void navigateToDigitalDownloadsPageandVerifyText() {
        homePage.selectMenu("Digital Downloads");
        homePage.verifyDigitalDownloadsText();
    }
    @Test
    public void navigateToBooksPageandVerifyText() {
        homePage.selectMenu("Books");
        homePage.verifyBooksText();
    }
    @Test
    public void navigateToJewelryPageandVerifyText() {
        homePage.selectMenu("Jewelry");
        homePage.verifyJewelryText();
    }
    @Test
    public void navigateToGiftCardsPageandVerifyText() {
        homePage.selectMenu("Gift Cards");
        homePage.verifyGiftCardsText();
    }
}
