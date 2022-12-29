package steps;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	@Before
	public static void Setup()
	{
		SeleniumDriver.setUpDriver();
	}

}
