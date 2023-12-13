package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GymPage extends MainFactoryPage {

    @FindBy(css = "[aria-label='Gym']")
    private WebElement gymContainer;
    @FindBy(css = "[aria-label='Basket']")

    private WebElement arrowContainer;

    public boolean isGymContainerDisplayed() {
        return gymContainer.isDisplayed();
    }

    public boolean isArrowConteinerDisplayed() {
        return arrowContainer.isDisplayed();
    }

}
