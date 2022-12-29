package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.actions.CarsGuideHomePageActions;
import page.actions.SearchCarPageActions;
import utils.SeleniumDriver;

public class SearchCarStep {

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	SearchCarPageActions searchCarPageActions = new SearchCarPageActions();

	@Given("user should be on the homepage {string} of cars guide website")
	public void user_should_be_on_the_homepage_of_cars_guide_website(String URL) {
		SeleniumDriver.openPage(URL);
	}

	@When("user hover  menu")
	public void user_hover_menu(List<String> list) {

		String menu = list.get(1);
		System.out.println("Seleted Menu : " + menu);
		carsGuideHomePageActions.moveToBuyAndSell();
	}

	@And("click the {string} link")
	public void click_the_link(String searchCar) {
		carsGuideHomePageActions.clickSearchCarLink();
	}

	@And("user select the make as {string}")
	public void user_select_the_make_as(String carBrand) {
		searchCarPageActions.selectMake(carBrand);
	}

	@And("user select the model as {string}")
	public void user_select_the_model_as(String model) {
		searchCarPageActions.selectModel(model);
	}

	@Then("user selet the location as {string}")
	public void user_selet_the_location_as(String location) {
		searchCarPageActions.selectLocation(location);
	}

	@And("user select the pricemax value as {string}")
	public void user_select_the_pricemax_value_as(String price) {
		searchCarPageActions.selectPriceMax(price);
	}

	@And("click the find my next car button")
	public void click_the_find_my_next_car_button() {
		searchCarPageActions.clickOnFindMyNewCarButton();
	}

	@Then("user can see list of searched cars")
	public void user_can_see_list_of_searched_cars() {

	}

	@And("user verify page title should be {string}")
	public void user_verify_page_title_should_be(String string) {

	}

}
