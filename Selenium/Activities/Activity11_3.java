package SeleniumActivities;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				Actions action =new Actions(driver);
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/tab-opener");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				String parentWindow = driver.getWindowHandle();
				System.out.println(parentWindow);
				
				WebElement clickme = driver.findElement(By.id("launcher"));
				clickme.click();
				wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				
				Set<String> allwindowHandles = driver.getWindowHandles();
				System.out.println(allwindowHandles);
				
				for (String handle : driver.getWindowHandles()) {
		            driver.switchTo().window(handle);
		        }
				
				
			
				
				
				
				
				
				driver.quit();

	}

}
