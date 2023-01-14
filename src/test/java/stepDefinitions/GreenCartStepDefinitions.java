package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenCartStepDefinitions {
	public WebDriver driver = new ChromeDriver();
	
	@Given("^User is on GreenCart Lading Page$")
    public void user_is_on_greencart_lading_page() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
      
    }

    @When("^user searched with short name \"([^\"]*)\" and extracted actual name of product$")
    public void user_searched_with_short_name_something_and_extracted_actual_name_of_product(String strArg1) throws Throwable {
    	driver.findElement(By.cssSelector(".search-keyword")).sendKeys("Tom");
      
    }

    @Then("^user serached for same shortname in offers page to check if product exist$")
    public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist() throws Throwable {
        
    }

}
