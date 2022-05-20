package SeleniumActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				Actions action =new Actions(driver);
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://www.training-support.net/selenium/input-events");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement cube = driver.findElement(By.id("wrapD3Cube"));
				
				action.click(cube);
				WebElement cubeVal = driver.findElement(By.className("active"));
				System.out.println(cubeVal.getText());
				
				action.doubleClick(cube).perform();
				cubeVal = driver.findElement(By.className("active"));
				System.out.println(cubeVal.getText());
				
				action.contextClick(cube).perform();
		        cubeVal = driver.findElement(By.className("active"));
		        System.out.println("Right Click: " + cubeVal.getText());
				
				
				
				driver.quit();

	}

}
