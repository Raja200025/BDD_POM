package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	@FindBy(how = How.LINK_TEXT, using = "buy + sell")
	public WebElement buyAndSellLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Search Cars")
	public WebElement SearchCarsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Used")
	public WebElement UsedLink ;
	
	@FindBy(how = How.LINK_TEXT, using = "New")
	public WebElement NewLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Find a Dealer")
	public WebElement FindADealerLink;
	
	@FindBy(how = How.LINK_TEXT, using = "What car should I buy?")
	public WebElement WhatCarShouldIBuy;
	
	// all the header links

	@FindBy(how = How.LINK_TEXT, using = "reviews")
	public WebElement reviews;

	@FindBy(how = How.LINK_TEXT, using = "news")
	public WebElement news;

	@FindBy(how = How.LINK_TEXT, using = "advice")
	public WebElement advice;

	@FindBy(how = How.LINK_TEXT, using = "pricing + specs")
	public WebElement pricingAndspecs;

	@FindBy(how = How.LINK_TEXT, using = "guides")
	public WebElement guides;

}
