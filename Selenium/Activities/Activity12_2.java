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

public class Activity12_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				Actions action =new Actions(driver);
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/nested-iframes");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				driver.switchTo().frame(0);
				
				driver.switchTo().frame(0);
				
				
				WebElement firstFrame = driver.findElement(By.xpath("/html/body/div[1]/div/div"));
				System.out.println(firstFrame.getText());
				
				driver.switchTo().defaultContent();
				
				driver.switchTo().frame(0);
				
				driver.switchTo().frame(1);
				WebElement secondFrame = driver.findElement(By.xpath("/html/body/div[1]/div/div"));
				System.out.println(secondFrame.getText());
			
			
				driver.quit();

	}

}
