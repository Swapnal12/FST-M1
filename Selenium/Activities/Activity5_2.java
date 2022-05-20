package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/dynamic-controls");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
				System.out.println(checkBox.isSelected());
				Thread.sleep(2000);
				
				checkBox.click();
				
				System.out.println(checkBox.isSelected());
				Thread.sleep(2000);
				
				
				driver.quit();

	}

}
