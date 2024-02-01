package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	
	public HomePage homeobj;
	public OfferPage offerobj;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public HomePage homePageObject() {
		homeobj = new HomePage(driver);
		return homeobj;
	}
	
	public OfferPage offerPageObject() {
		offerobj = new OfferPage(driver);
		return offerobj;
	}

}
