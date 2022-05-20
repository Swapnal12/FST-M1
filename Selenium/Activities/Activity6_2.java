package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/ajax");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement ChangeContentbtn = driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button"));
				ChangeContentbtn.click();
				
				WebElement hello = driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h1"));
				System.out.println(hello.getText());
				wait.until(ExpectedConditions.visibilityOf(hello));
				
				WebElement late = driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h3"));
				
				System.out.println(late.getText());
				wait.until(ExpectedConditions.visibilityOf(late));
				
				
				
				driver.quit();

	}

}
