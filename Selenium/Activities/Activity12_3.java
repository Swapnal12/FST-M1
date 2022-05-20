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

public class Activity12_3 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				Actions action =new Actions(driver);
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/popups");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
				
				action.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
				String tooltip=button.getAttribute("data-tooltip");
				System.out.println(tooltip);
				
				button.click();
				
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("admin");
				
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("password");
				
				WebElement signin = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
				signin.click();
				
				WebElement Text = driver.findElement(By.id("action-confirmation"));
				System.out.println(Text.getText());
				
				
			
			
				driver.quit();

	}

}
