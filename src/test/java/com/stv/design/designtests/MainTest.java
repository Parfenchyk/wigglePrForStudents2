package com.stv.design.designtests;

import com.stv.design.designpages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BasicTest {

    @Test(description = "Assert the main page is loaded and the main logo is visible")
    public void assertWiggleIconIsDisplayed() {
        MainPage mainPage = new MainPage();
        mainPage.clickOnTrustButton();
        Assert.assertEquals(mainPage.isMainLogoDisplayed(), true, "The main page isn't loaded properly");
        Assert.assertEquals(mainPage.isAboutWiggleDisplayed(),true, "The About Wiggle isn`t found");
    }
}
