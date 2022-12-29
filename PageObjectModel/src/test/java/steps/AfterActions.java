package steps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	@After
	public static void tearDown(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			TakesScreenshot screenshot = (TakesScreenshot) SeleniumDriver.getDriver();
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			long time= System.currentTimeMillis();
			File destinationFile = new File(
					"C:\\Users\\Rajamanickan G\\Documents\\BDD_POM\\ScreenShot\\screenshot" + time + ".png");
			String path = destinationFile.getAbsolutePath();
			System.out.println("File Path : " + path);
			System.out.println("Destination File : "+destinationFile);
			FileHandler.copy(sourceFile, destinationFile);
		}
		SeleniumDriver.tearDown();
	}

}
