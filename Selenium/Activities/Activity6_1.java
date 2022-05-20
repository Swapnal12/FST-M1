package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/dynamic-controls");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement CheckBox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/label"));
				WebElement toggleCheck = driver.findElement(By.id("toggleCheckbox"));
				toggleCheck.click();
				
				wait.until(ExpectedConditions.invisibilityOf(CheckBox));
				toggleCheck.click();
				
				wait.until(ExpectedConditions.visibilityOf(CheckBox));
				toggleCheck.click();
				
				
				driver.quit();

	}

}
