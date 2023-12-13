package com.stv.factory.factorytests;

import com.stv.factory.factorypages.AllBrandsPage;
import com.stv.factory.factorypages.DNBPage;
import com.stv.factory.factorypages.GymPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.stv.framework.core.drivers.Driver.driver;
import static com.stv.framework.core.lib.WigglePageURLs.SEARCH_DHB;

public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    GymPage gymPage = new GymPage();
    DNBPage dnbPage = new DNBPage();
    AllBrandsPage allBrandsPage = new AllBrandsPage();

    @Test(description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() throws InterruptedException {
        boolean actualResult = mainFactoryPage.isGymLinkDisplayed();
        mainFactoryPage.clickOnTrustButton();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
        Thread.sleep(3000);

    }

    @Test(description = "Assert the gym page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertGymPageOpened() throws InterruptedException {
        mainFactoryPage.clickOnGymLink();
        Thread.sleep(2000);
        Assert.assertEquals(new GymPage().isGymContainerDisplayed(), true, "Gym page isn't loaded properly");
        Thread.sleep(3000);
    }

    @Test(description = "Assert arrow is clicked", dependsOnMethods = "assertGymPageOpened")
    public void assertArrowClicked() throws InterruptedException {
        gymPage.clickOnArrowLink();
        Thread.sleep(2000);
        Assert.assertEquals(new GymPage().isArrowConteinerDisplayed(), true, "Arrow link isn't loaded properly");
        Thread.sleep(3000);
    }

    @Test(description = "Assert DNB is clicked", dependsOnMethods = "assertArrowClicked")
    public void assertDNBClicked() throws InterruptedException {
        dnbPage.clickOnDNBLink();
        Thread.sleep(2000);
        Assert.assertEquals(new DNBPage().isDNBConteinerDisplayed(), true, "DNB page isn't loaded properly");
        Thread.sleep(3000);
    }

    @Test(description = "Assert All Brands is clicked", dependsOnMethods = "assertDNBClicked")
    public void assertScrollDownPage() throws InterruptedException {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(2000);
        dnbPage.clickOnAllBrandsLink();
        Thread.sleep(3000);
        Assert.assertEquals(new AllBrandsPage().isAllBrandsConteinerDisplayed(), true, "All Brands page isn't loaded properly");
        Thread.sleep(3000);
    }

    @Test(description = "Search DHB", dependsOnMethods = "assertScrollDownPage")
    public void assertSearch() throws InterruptedException {
        allBrandsPage.getSearchField().clear();
        Thread.sleep(2000);
        allBrandsPage.inputText(allBrandsPage.getSearchField(), SEARCH_DHB);
        allBrandsPage.clickOnSearchButton();
        Thread.sleep(3000);
        Assert.assertEquals(new AllBrandsPage().isSearchDisplayed(), true, "DHB isn't found");
        Thread.sleep(3000);

    }

}
