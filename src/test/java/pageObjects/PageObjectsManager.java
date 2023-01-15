package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.GenericUtils;

public class PageObjectsManager {
	
	private LandingPage landingpage;
	private OffersPage offerspage;
	private WebDriver driver;

	
	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage getOffersPage() {
		offerspage = new OffersPage(driver);
		return offerspage;
	}
	
	
	

}
