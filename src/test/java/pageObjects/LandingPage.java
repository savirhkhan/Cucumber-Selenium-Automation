package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	public WebDriver driver;
	

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	private By searchBox = By.cssSelector(".search-keyword");
	private By searchResults = By.cssSelector("h4[class='product-name']");
	private By offerLink = By.linkText("Top Deals");

	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}

	public WebElement getSearchResults() {
		return driver.findElement(searchResults);
	}

	public WebElement getOfferLink() {
		return driver.findElement(offerLink);
	}

}
