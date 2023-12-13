package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "[aria-label='Gym']")
    private WebElement gymLink;
    @FindBy(xpath = "//button[@data-nav='main-nav-next-9feb9833-63a7-4bf0-8fb9-bdec87d80590']")
//    @FindBy(xpath = "//button[@class='Carousel_mainNavNext__iQNo9']")
//    @FindBy(xpath = "//button[@data-testid='08516f3b-5688-4105-b919-3fba5cdbcd17-next']")
//    @FindBy(css = "[aria-label='08516f3b-5688-4105-b919-3fba5cdbcd17-next']")
    private WebElement arrowLink;
    @FindBy(xpath = "//button[contains(text(),'Accept all ')]")
    private WebElement trustButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div/section/div/div/ul/li[8]")
//    @FindBy(xpath = "//li[@class='swiper-slide swiper-slide-active'] and li[@data-swiper-slide-index='1']")
//    @FindBy(xpath = "//div[@data-id='9feb9833-63a7-4bf0-8fb9-bdec87d80590']/li[@class='swiper-slide swiper-slide-active']")
//    @FindBy(xpath = "//a[@href='\"/b/dhb\"']")

    private WebElement DNBLink;

    public boolean isGymLinkDisplayed() {
        return gymLink.isDisplayed();
    }

    public void clickOnGymLink() {
        gymLink.click();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }

    public void clickOnArrowLink() {
        arrowLink.click();
    }

    public void clickOnDNBLink() {
        DNBLink.click();
    }
}
