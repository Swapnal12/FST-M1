package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://training-support.net");
				Thread.sleep(5000);
				String title = driver.getTitle();
				System.out.println(title);
				
				//by id
				
				WebElement aboutlink = driver.findElement(By.xpath("//*[@id=\"about-link\"]"));
				aboutlink.click();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				
				
				Thread.sleep(2000);
				driver.close();

	}

}
