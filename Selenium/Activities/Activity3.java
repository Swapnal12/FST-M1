package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://training-support.net/selenium/simple-form");
				Thread.sleep(5000);
				String title = driver.getTitle();
				System.out.println(title);
				
				//by id
				
				WebElement firstName = driver.findElement(By.id("firstName"));
				WebElement lastName = driver.findElement(By.id("lastName"));
				
				firstName.sendKeys("Kate");
				Thread.sleep(2000);
				lastName.sendKeys("Luaren");
				Thread.sleep(2000);
				
				WebElement email = driver.findElement(By.id("email"));
				WebElement number = driver.findElement(By.id("number"));
				
				email.sendKeys("Kate@gmail.com");
				Thread.sleep(2000);
				number.sendKeys("8765432189");
				Thread.sleep(2000);
				
				WebElement submit = driver.findElement(By.cssSelector("#simpleForm > div > div.spaced.two.fields > div:nth-child(1) > input"));
				submit.click();
				
				
				
				
				
				
				
				
				Thread.sleep(2000);
				driver.close();

	}

}
