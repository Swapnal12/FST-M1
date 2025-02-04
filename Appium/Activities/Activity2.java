package activites;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Appium_Activity2 {
	
	// Declare Android driver
		AndroidDriver<MobileElement> driver;
		WebDriverWait wait;
		
				
		@BeforeClass
		public void setUp() throws MalformedURLException {
			// Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "fc3e29dd1220");
			caps.setCapability("platformName", "Android");
			caps.setCapability("automationName", "UiAutomator2");
			caps.setCapability("appPackage", "com.android.chrome");
			caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
			caps.setCapability("noReset", true);

			// Instantiate Appium Driver
			URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
			 driver = new AndroidDriver<>(appServer, caps);
			 wait = new WebDriverWait(driver, 10);
		}
		
		@Test
		public void openBrowser()
		{
			driver.get("https://www.training-support.net/");
			
			// Wait for page to load
	        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));
	        
	     // Get heading on page and print it
	        String pageTitle = driver
	            .findElementByXPath("//android.widget.TextView[@text='Training Support']")
	            .getText();
	        System.out.println("Title on Homepage: " + pageTitle);
	 
	        // Find About Us button and click it
	        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@content-desc='About Us']");
	        aboutButton.click();
	 
	        // Wait for new page to load
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	            MobileBy.xpath("//android.widget.TextView[@text='About Us']")
	        ));
	 
	        // Get heading on About Us page and print it
	        String newPageTitle = driver
	            .findElementByXPath("//android.widget.TextView[@text='About Us']")
	            .getText();
	        System.out.println("Title on new page: " + newPageTitle);
	 
	        // Assertions
	        Assert.assertEquals(pageTitle, "Training Support");
	        Assert.assertEquals(newPageTitle, "About Us");
	    }
		@AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
		}