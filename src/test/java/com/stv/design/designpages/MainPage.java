package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends Page {

    private final By REGISTER_LINK_LOCATOR = By.xpath("//img[contains(@alt,'Wiggle')]");
    private final By REGISTER_ABOUT_WIGGLE_LOCATOR = By.xpath("//*[@id=\"__next\"]/div/div[10]/footer/div[1]/div/div/div[1]/h2");

    private final By TRUST_BUTTON = By.xpath("//button[contains(text(),'Accept all ')]");
    private final By GYM_BUTTON = By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div/div/nav/ul/li[6]/div[1]/div/a");


    public void clickOnTrustButton() {
        WebElement trustButton = getDriver().findElement(TRUST_BUTTON);
        trustButton.click();
    }

    public boolean isAboutWiggleDisplayed() {
        WebElement registerText = getDriver().findElement(REGISTER_ABOUT_WIGGLE_LOCATOR);
        return registerText.isDisplayed();
    }


    public void isClickOnDropDownListGym() {
        WebElement gymButton = getDriver().findElement(GYM_BUTTON);
        gymButton.submit();
    }

    public boolean isMainLogoDisplayed() {
        WebElement registerLink = getDriver().findElement(REGISTER_LINK_LOCATOR);
        return registerLink.isDisplayed();
    }
}
