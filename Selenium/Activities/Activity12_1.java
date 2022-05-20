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

public class Activity12_1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				Actions action =new Actions(driver);
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/iframes");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				driver.switchTo().frame(0);
				WebElement firstFrame = driver.findElement(By.xpath("/html/body/div[1]/div"));
				System.out.println(firstFrame.getText());
				
				WebElement frame0button = driver.findElement(By.id("actionButton"));
				System.out.println(frame0button.getCssValue("color"));
				
				frame0button.click();
				
				System.out.println(frame0button.getCssValue("color"));
				
				driver.switchTo().defaultContent();
				
				driver.switchTo().frame(1);
				WebElement secondFrame = driver.findElement(By.xpath("/html/body/div[1]/div"));
				System.out.println(secondFrame.getText());
				
				WebElement frame1button = driver.findElement(By.id("actionButton"));
				System.out.println(frame1button.getCssValue("color"));
				
				frame1button.click();
				
				System.out.println(frame1button.getCssValue("color"));
			
				
				
				
				driver.quit();

	}

}
