package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OffersPage {
	
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By searchBoxOnOfferPage = By.id("search-field");
	private By searchResultsOnOfferPage = By.cssSelector("tr td:nth-child(1)");
	
	public WebElement getSearchBoxOnOfferPage() {
		return driver.findElement(searchBoxOnOfferPage);
	}
	public WebElement getSearchResultsOnOfferPage() {
		return driver.findElement(searchResultsOnOfferPage);
	}

}
