package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenCartStepDefinitions {
	public WebDriver driver;
	String textFromMainPage;
	String textFromOfferPage;

	@Given("^User is on GreenCart Lading Page$")
	public void user_is_on_greencart_lading_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

	}

	@When("^user searched with short name \"([^\"]*)\" and extracted actual name of product$")
	public void user_searched_with_short_name_something_and_extracted_actual_name_of_product(String strArg1)
			throws Throwable {
		driver.findElement(By.cssSelector(".search-keyword")).sendKeys(strArg1);
		Thread.sleep(2000);
		textFromMainPage = driver.findElement(By.cssSelector("h4[class='product-name']")).getText().split("-")[0].trim();
		System.out.println(textFromMainPage);

	}

	@Then("^user serached for same shortname in offers page to check if product exist$")
	public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist() throws Throwable {
		driver.findElement(By.linkText("Top Deals")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> I1 = windowHandles.iterator();
		String parentWindow = I1.next();
		String childWindow = I1.next();
        driver.switchTo().window(childWindow);
        
		driver.findElement(By.id("search-field")).sendKeys("Tom");
		Thread.sleep(2000);
		textFromOfferPage = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		System.out.println(textFromOfferPage);
		

	}
	
	@Then("^validate product name matches with landing page$")
    public void validate_product_name_matches_with_landing_page() throws Throwable {
		Assert.assertEquals(textFromMainPage, textFromOfferPage);
    }


}
