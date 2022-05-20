package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://training-support.net/selenium/dynamic-attributes");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement login = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input"));
				login.sendKeys("admin");
				
				WebElement password = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input"));
				password.sendKeys("password");
				
				WebElement submit = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
				submit.click();
				
				WebElement confirm = driver.findElement(By.id("action-confirmation"));
				
				
				
				System.out.println(confirm.getText());
				
				driver.quit();

	}

}
