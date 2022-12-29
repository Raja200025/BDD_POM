package page.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import page.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void moveToBuyAndSell() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyAndSellLink).perform();
	}

	public void clickSearchCarLink() {
		// moveToBuyAndSell if want to perform this method means call before method
		// because you need click means first you need to hover
		carsGuideHomePageLocators.SearchCarsLink.click();
	}

	public void NewCarLink() {
		// moveToBuyAndSell

		carsGuideHomePageLocators.NewLink.click();
	}

	public void FindADealer() {
		// moveToBuyAndSell
		carsGuideHomePageLocators.FindADealerLink.click();
	}

	public void WhatCarShouldIBuy()
	{
		// moveToBuyAndSell
		carsGuideHomePageLocators.WhatCarShouldIBuy.clear();
	}

}
