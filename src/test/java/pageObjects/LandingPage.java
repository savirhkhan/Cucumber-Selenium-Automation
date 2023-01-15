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
	private By incrementProduct = By.cssSelector(".increment");
	private By addToCartButton = By.cssSelector(".products-wrapper button");
	private By cartPageButton = By.cssSelector("[alt='Cart']");
	private By proceeedToCheckOutButton = By.cssSelector("div[class='cart-preview active'] button[type='button']");

	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}

	public WebElement getSearchResults() {
		return driver.findElement(searchResults);
	}

	public WebElement getOfferLink() {
		return driver.findElement(offerLink);
	}

	public WebElement getincrementProduct() {
		return driver.findElement(incrementProduct);
	}

	public WebElement getaddToCartButton() {
		return driver.findElement(addToCartButton);
	}

	public WebElement getcartPageButton() {
		return driver.findElement(cartPageButton);
	}

	public WebElement getproceeedToCheckOutButton() {
		return driver.findElement(proceeedToCheckOutButton);
	}

}
