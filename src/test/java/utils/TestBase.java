package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws Exception {

		FileInputStream f = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(f);
		String url = prop.getProperty("qaurl");

		if (driver == null) {
//			if (url == "chrome") {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\achun\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				driver.manage().window().maximize();
			}
//		}
		return driver;
	}

}
