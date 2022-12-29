package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/feature",
				 glue="steps",tags="@Search-car",monochrome=true,dryRun=false,
				 plugin= {"json:target/runner/cucumber.json","pretty","html:target/runner/cucumber",
						 "com.cucumber.listener.ExtentCucumberFormatter"})
public class Runner extends AbstractTestNGCucumberTests {

}
