package stepDefinitions;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	public TestContextSetup testContext;
	
	public Hooks(TestContextSetup testContext) {
		this.testContext = testContext;
	}
	
	@After
	public void tearDown() throws IOException {
		testContext.testBase.webDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws WebDriverException, IOException {
		if (scenario.isFailed()) {
			File sourcepath = ((TakesScreenshot)testContext.testBase.webDriverManager()).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
		
	}
	

}
