package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import page.locators.SearchCarPageLocators;
import utils.SeleniumDriver;

public class SearchCarPageActions {
	
	SearchCarPageLocators searchCarPageLocators=null;
	
	public SearchCarPageActions()
	{
		this.searchCarPageLocators=new SearchCarPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarPageLocators);
	}
	
	public void selectMake(String CarBrand) {
		Select select=new Select(searchCarPageLocators.makesDropDown);
		select.selectByValue(CarBrand);
	}
	public void selectModel(String carModel) {
		Select select=new Select(searchCarPageLocators.modelsDropDown);
		select.selectByValue(carModel);
	}
	public void selectLocation(String location) {
		Select select=new Select(searchCarPageLocators.locationsDropDown);
		select.selectByValue(location);
	}
	public void selectPriceMax(String priceMax) {
		Select select=new Select(searchCarPageLocators.priceToDropDown);
		select.selectByValue(priceMax);
	}
	public void clickOnFindMyNewCarButton()
	{
		searchCarPageLocators.FindMyNextcarButton.click();
	}

}
