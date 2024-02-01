package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public TestBase testbase;
	public PageObjectManager pageobjectmanager;
	
	
	public TestContextSetup() throws Exception {
		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
		
		
	}


}
