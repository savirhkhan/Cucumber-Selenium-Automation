package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

	public String textFromMainPage;
	TestContextSetup testContexts;

	public LandingPageStepDefinitions(TestContextSetup testContexts) {
		this.testContexts = testContexts;
	}

	@Given("^User is on GreenCart Lading Page$")
	public void user_is_on_greencart_lading_page() throws Throwable {
		testContexts.driver = new ChromeDriver();
		testContexts.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("^user searched with short name \"([^\"]*)\" and extracted actual name of product$")
	public void user_searched_with_short_name_something_and_extracted_actual_name_of_product(String strArg1)
			throws Throwable {

		LandingPage landingPage = testContexts.pageobjectmanager.getLandingPage();
		landingPage.getSearchBox().sendKeys(strArg1);
		Thread.sleep(2000);
		testContexts.textFromMainPage = landingPage.getSearchResults().getText().split("-")[0].trim();
		landingPage.getOfferLink().click();
		System.out.println(textFromMainPage);

	}

}
