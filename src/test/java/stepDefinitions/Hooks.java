package stepDefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.reporter.FileUtil;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testcontextsetup;
	
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@After
	
	public void AfterScenario() throws Exception {
		testcontextsetup.testbase.WebDriverManager().quit();
	}
	
	@AfterStep
	
	public void addScreenshot(Scenario scenario) throws Exception {
		
		WebDriver driver = testcontextsetup.testbase.WebDriverManager();
		if(scenario.isFailed()) {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent = FileUtils.readFileToByteArray(f);
		
		scenario.attach(filecontent, "image/png", "image");
	}
	}

}
