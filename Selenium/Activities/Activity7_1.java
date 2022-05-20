package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://training-support.net/selenium/dynamic-attributes");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
				
				username.sendKeys("swapnal");
				
				WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
				password.sendKeys("new_password");
				
				WebElement confirm_password = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
				confirm_password.sendKeys("new_password");
				
				WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));
				email.sendKeys("swapnal_new@gmail.com");
				
				WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button"));
				button.click();
				
				WebElement confirmation = driver.findElement(By.id("action-confirmation"));
				System.out.println(confirmation.getText());
				
				
				driver.quit();

	}

}
