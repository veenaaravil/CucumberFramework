package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import utils.TestBase;
import utils.TestContextSetup;

public class HomePageStepDefinition {
	
	public WebDriver driver;
	TestContextSetup testcontextsetup;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public HomePage homepage;
	
	
	public HomePageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		homepage = testcontextsetup.pageobjectmanager.homePageObject();
		
		
	}
	
	@Given("User landed on Home page")
	public void user_landed_on_home_page() {
		
//		System.out.println(homepage.driver.getCurrentUrl());
		System.out.println("Landed on home page");
		
		
	}
	@When("^User search (.+) in the search box$")
	public void user_search_in_the_search_box(String name) {
		homepage.searchItem(name);
		homepage.verifyItem();
		homepage.clickOfferPage();
		  
	}
	

}
