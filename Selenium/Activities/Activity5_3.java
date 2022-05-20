package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/dynamic-controls");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement enableBox = driver.findElement(By.id("dynamicText"));
				System.out.println(enableBox.isEnabled());
				Thread.sleep(2000);
				
				WebElement enableBoxyes = driver.findElement(By.id("toggleInput"));
				enableBoxyes.click();
				
				System.out.println(enableBox.isEnabled());
				Thread.sleep(2000);
				
				
				driver.quit();

	}

}
