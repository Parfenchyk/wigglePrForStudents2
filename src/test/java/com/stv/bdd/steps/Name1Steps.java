package com.stv.bdd.steps;

import com.stv.design.designpages.MainPage;
import com.stv.factory.factorypages.GymPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.MainFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class Name1Steps extends MainFactoryTest {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    GymPage gymPage = new GymPage();

    //    @When("Home page is opened")
    @Given("^Home page is opened$")
    public void homePageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainFactoryPage.isGymLinkDisplayed();
    }

    @When("^About Wiggle is displayed$")
//    @Then("About Wiggle is displayed")
    public void aboutWiggleIsDisplayed() {
        mainPage.isAboutWiggleDisplayed();
    }

    //    @And("Account Link is displayed")
    @Then("^Account Link is displayed$")
    public void accountLinkIsDisplayed() {
        mainFactoryPage.isGymLinkDisplayed();
    }

    @And("Click on Arrow")
    public void clickOnArrow() {
        gymPage.clickOnArrowLink();
    }

}