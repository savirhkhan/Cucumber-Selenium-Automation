package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage {
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By productNameOnCartPage = By.cssSelector(".product-name");
	private By promoButton = By.cssSelector(".promoBtn");
	private By placeOrderButton = By.cssSelector(".products > div > button");
	
	
	public WebElement getproductNameOnCartPage() {
		return driver.findElement(productNameOnCartPage);
	}
	public WebElement getpromoButton() {
		return driver.findElement(promoButton);
	}
	public WebElement getplaceOrderButton() {
		return driver.findElement(placeOrderButton);
	}

}
