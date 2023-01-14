package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import io.cucumber.java.en.Then;
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

		switchToOffersPage();
		OffersPage offerspage = testContexts.pageobjectmanager.getOffersPage();
		offerspage.getSearchBoxOnOfferPage().sendKeys("Tom");
		Thread.sleep(2000);
		textFromOfferPage = offerspage.getSearchResultsOnOfferPage().getText();
		System.out.println(textFromOfferPage);

	}

	public void switchToOffersPage() {
		if (!testContexts.driver.getCurrentUrl()
				.equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {
			Set<String> windowHandles = testContexts.driver.getWindowHandles();
			Iterator<String> I1 = windowHandles.iterator();
			String parentWindow = I1.next();
			String childWindow = I1.next();
			testContexts.driver.switchTo().window(childWindow);
		}

	}

	@Then("^validate product name matches with landing page$")
	public void validate_product_name_matches_with_landing_page() throws Throwable {
		Assert.assertEquals(testContexts.textFromMainPage, textFromOfferPage);
	}

}
