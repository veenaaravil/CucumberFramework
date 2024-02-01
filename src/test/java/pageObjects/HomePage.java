package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
	public WebDriver driver;
	
	
//	@FindBy(xpath = "//input[@class='search-keyword']") public WebElement search_box;
	By seach_box = By.xpath("//input[@class='search-keyword']");
	By search_btn = By.xpath("//button[@class='search-button']");
	By prod_name = By.xpath("//h4[@class='product-name']");
	By prod_price = By.xpath("//p[@class='product-price']");
	By add_to_cart_btn = By.xpath("//button[text()='ADD TO CART']");
	
	By offer_page_btn = By.linkText("Top Deals");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchItem(String item) {
		driver.findElement(seach_box).sendKeys(item);
		driver.findElement(search_btn).click();
		System.out.println("Homepage item successfully searched");
	}
	
	public void verifyItem() {
		String expectedName = "Tomato - 1 Kg";
		String expectedPrice = "16";
		
		String actualName = driver.findElement(prod_name).getText();
		String actualPrice = driver.findElement(prod_price).getText();
		
		boolean prodName =  expectedName.equals(actualName);
		boolean prodPrize = expectedPrice.equals(actualPrice);
		
		Assert.assertEquals(prodName, false);
		Assert.assertEquals(prodPrize, false);
		System.out.println("Homepage item successfully verified");

	}
	
	public void clickOfferPage() {
		driver.findElement(offer_page_btn).click();
	}
}
