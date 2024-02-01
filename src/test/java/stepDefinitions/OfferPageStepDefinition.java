package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestBase;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
//	public WebDriver driver;
	public TestBase testbase;
	TestContextSetup testcontextsetup;
	public PageObjectManager pageobjectmanager;
	public OfferPage offerobject;
	
	
	public OfferPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
//		testbase = testcontextsetup.testbase;
		offerobject= testcontextsetup.pageobjectmanager.offerPageObject();
		
	}
	
//	@Given("User is on offer page")
//	public void user_is_on_offer_page() {
//		offerobject.validateOfferPage();
//		
//	   
//	}
	@When("User search offer page item {string}")
	public void user_search_offer_page_item(String name) {
		offerobject.searchOfferItem(name);
	   
	}
	@Then("The result is displayed")
	public void the_result_is_displayed() {
		offerobject.verifyResult();
	    
	}


}
