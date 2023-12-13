package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllBrandsPage extends MainFactoryPage {
    @FindBy(xpath = "//h3[@class='BrandList_title__Q0IzG']")
    private WebElement allBrandsConteiner;
    @FindBy(xpath = "//input[@aria-autocomplete='both']")
    private WebElement searchField;
    @FindBy(xpath = "//button[@data-testid='search-box-input-button']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='BrandLogo_image__H9FIT']")
    private WebElement searchConteiner;

    public boolean isAllBrandsConteinerDisplayed() {
        return allBrandsConteiner.isDisplayed();
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public void inputText(WebElement el, String text) {
        el.sendKeys(text);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public boolean isSearchDisplayed() {
        return searchConteiner.isDisplayed();
    }
}
