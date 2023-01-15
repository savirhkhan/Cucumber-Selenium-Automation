package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

	TestContextSetup testContexts;

	public LandingPageStepDefinitions(TestContextSetup testContexts) {
		this.testContexts = testContexts;
	}

	@Given("^User is on GreenCart Lading Page$")
	public void user_is_on_greencart_lading_page() throws Throwable {

	}

	@When("^user searched with short name(.+)and Add three product to cart$")
    public void user_searched_with_short_nameand_add_three_product_to_cart(String product) throws Throwable {

		LandingPage landingPage = testContexts.pageobjectmanager.getLandingPage();
		landingPage.getSearchBox().sendKeys(product);
		Thread.sleep(2000);
		testContexts.textFromMainPage = landingPage.getSearchResults().getText().split("-")[0].trim();
		landingPage.getincrementProduct().click();
		landingPage.getincrementProduct().click();
		landingPage.getaddToCartButton().click();
		landingPage.getcartPageButton().click();
		landingPage.getproceeedToCheckOutButton().click();
		

	}

	@When("^user searched with short name (.+) and extracted actual name of product$")
    public void user_searched_with_short_name_and_extracted_actual_name_of_product(String product)
			throws Throwable {

		LandingPage landingPage = testContexts.pageobjectmanager.getLandingPage();
		landingPage.getSearchBox().sendKeys(product);
		Thread.sleep(2000);
		testContexts.textFromMainPage = landingPage.getSearchResults().getText().split("-")[0].trim();
		System.out.println(testContexts.textFromMainPage);

	}
	
	

}
