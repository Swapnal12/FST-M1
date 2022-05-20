package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://training-support.net/selenium/simple-form");
				Thread.sleep(5000);
				String title = driver.getTitle();
				System.out.println(title);
				
				//by id
				
				WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
				WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
				
				firstName.sendKeys("shirin");
				Thread.sleep(2000);
				lastName.sendKeys("Luara");
				Thread.sleep(2000);
				
				WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
				WebElement number = driver.findElement(By.xpath("//*[@id=\"number\"]"));
				
				email.sendKeys("shirin@gmail.com");
				Thread.sleep(2000);
				number.sendKeys("8765432176");
				Thread.sleep(2000);
				
				WebElement submit = driver.findElement(By.xpath("//*[@id=\"simpleForm\"]/div/div[6]/div[1]/input"));
				submit.click();
				
				
				
				
				
				
				
				
				Thread.sleep(2000);
				driver.close();

	}

}
