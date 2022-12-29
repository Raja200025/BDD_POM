package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchCarPageLocators {
	
	@FindBy(how = How.XPATH, using = "//select[@id='makes']")
	public WebElement makesDropDown;
	
	
	@FindBy(how = How.XPATH, using = "//select[@id='models']")
	public WebElement modelsDropDown;
	
	@FindBy(how = How.XPATH, using = "//select[@id='locations']")
	public WebElement locationsDropDown;
	
	@FindBy(how = How.XPATH, using = "//select[@id='priceTo']")
	public WebElement priceToDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='search-submit']")
	public WebElement FindMyNextcarButton;
	
	
	

}
