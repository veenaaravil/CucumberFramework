package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OfferPage {
	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search_field = By.id("search-field");
	
	
	public void searchOfferItem(String name) {
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(search_field).sendKeys(name);
		System.out.println("Searched offerpage item");
	}
	
	public void validateOfferPage() {
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
		String currentUrl = driver.getCurrentUrl();
		if(url.equals(currentUrl)) {
			System.out.println("This is offer page");
		}
	
	}
	
	public void verifyResult() {
		System.out.println("Result is verified in offerpage");
	}
}
