package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OfferPageStepDefinitions {

	public String textFromOfferPage;
	TestContextSetup testContexts;

	public OfferPageStepDefinitions(TestContextSetup testContexts) {
		this.testContexts = testContexts;
	}

	@Then("^user serached for same shortname in offers page to check if product exist$")
	public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist() throws Throwable {

		switchOffersPage();
		OffersPage offerspage = testContexts.pageobjectmanager.getOffersPage();
		offerspage.getSearchBoxOnOfferPage().sendKeys("Tom");
		Thread.sleep(2000);
		textFromOfferPage = offerspage.getSearchResultsOnOfferPage().getText();
		System.out.println(textFromOfferPage);

	}
	
	public void switchOffersPage() {
		LandingPage landingPage = testContexts.pageobjectmanager.getLandingPage();
		landingPage.getOfferLink().click();
		testContexts.genericUtils.switchToChild();
	}

	@Then("^validate product name matches with landing page$")
	public void validate_product_name_matches_with_landing_page() throws Throwable {
		Assert.assertEquals(testContexts.textFromMainPage, textFromOfferPage);
	}

}
