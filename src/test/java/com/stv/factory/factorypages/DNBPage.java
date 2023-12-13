package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DNBPage extends MainFactoryPage {
    @FindBy(xpath = "//div[@class='BrandLogo_image__H9FIT']")
    private WebElement DNBConteiner;

    @FindBy(xpath = "//a[contains(text(),'All Brands')]")

    private WebElement AllBrands;

    public boolean isDNBConteinerDisplayed() {
        return DNBConteiner.isDisplayed();
    }

    public void clickOnAllBrandsLink() {
        AllBrands.click();
    }
}
