package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectsManager;
import stepDefinitions.Hooks;

public class TestContextSetup {
	public WebDriver driver;
	public String textFromMainPage;
	public PageObjectsManager pageobjectmanager;
	public TestBase testBase;
	public  GenericUtils genericUtils;
	
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageobjectmanager = new PageObjectsManager(testBase.webDriverManager());
		genericUtils = new GenericUtils(testBase.webDriverManager());
		
	}
	
	

}
