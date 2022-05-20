package SeleniumActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				Actions action =new Actions(driver);
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/javascript-alerts");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement simpleAlert = driver.findElement(By.id("confirm"));
				simpleAlert.click();
				
				Alert alert1 =driver.switchTo().alert();
				
				String simpleAlertText = alert1.getText();
				System.out.println(simpleAlertText);
				
				//alert1.accept();
				
				alert1.dismiss();
				
				
				driver.quit();

	}

}
