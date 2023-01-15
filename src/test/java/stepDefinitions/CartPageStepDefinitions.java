package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CartPage;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class CartPageStepDefinitions {

	public String textFromOfferPage;
	TestContextSetup testContexts;

	public CartPageStepDefinitions(TestContextSetup testContexts) {
		this.testContexts = testContexts;
	}
	
	@Then("^varify same product is added to cart and apply and place Order button displayed$")
    public void varify_same_product_is_added_to_cart_and_apply_and_place_order_button_displayed() throws InterruptedException {
		CartPage cartpage = testContexts.pageobjectmanager.getcartPage();
		String productNameOnCartPage = cartpage.getproductNameOnCartPage().getText().split("-")[0].trim();
		String promoButtonText = cartpage.getpromoButton().getText();
		Thread.sleep(2000);
		String placeOrderButtonText = cartpage.getplaceOrderButton().getText();
		//Assert.assertEquals(productNameOnCartPage, testContexts.textFromMainPage);
		Assert.assertEquals(promoButtonText, "Apply");
		Assert.assertEquals(placeOrderButtonText, "Place Order");
	}


	

}
