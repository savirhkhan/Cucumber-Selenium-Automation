package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectsManager;

public class TestContextSetup {
	public WebDriver driver;
	public String textFromMainPage;
	public PageObjectsManager pageobjectmanager;
	
	public TestContextSetup() {
		pageobjectmanager = new PageObjectsManager(driver);
	}

}
