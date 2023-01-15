package stepDefinitions;


import java.io.IOException;

import io.cucumber.java.After;
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
	

}
