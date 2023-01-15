package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectsManager;

public class TestContextSetup {
	public WebDriver driver;
	public String textFromMainPage;
	public PageObjectsManager pageobjectmanager;
	public TestBase testBase;
	public  GenericUtils genericUtils;
	
	
	public TestContextSetup() {
		testBase = new TestBase();
		pageobjectmanager = new PageObjectsManager(testBase.webDriverManager());
		genericUtils = new GenericUtils(testBase.webDriverManager());
	}
	
	

}
