package SeleniumActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				Actions action =new Actions(driver);
			
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				driver.get("https://training-support.net/selenium/drag-drop");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
				
				
				WebElement drop1 = driver.findElement(By.id("droppable"));
				WebElement Ball = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
				WebElement drop2 = driver.findElement(By.id("dropzone2"));
				
				action.dragAndDrop(Ball, drop1).build().perform();
				wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
		        System.out.println("ENTERED DROPZONE 1");
		        
		        
		        action.dragAndDrop(Ball, drop2).build().perform();
		        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
		        System.out.println("ENTERED DROPZONE 2");
				
				
				
				
				
				driver.quit();

	}

}
