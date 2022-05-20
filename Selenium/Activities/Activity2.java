package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.training-support.net/");
				Thread.sleep(5000);
				String title = driver.getTitle();
				System.out.println(title);
				
				//by id
				
				WebElement aboutus = driver.findElement(By.id("about-link"));
				String aboutus_text = aboutus.getText();
				System.out.println(aboutus_text);
				
				//by class
				
				WebElement aboutus_class = driver.findElement(By.className("green"));
				String aboutusclass_text = aboutus_class.getText();
				System.out.println(aboutusclass_text);
				
				//by css selector
				WebElement aboutus_css = driver.findElement(By.cssSelector(".green"));
				String aboutuscss_text = aboutus_class.getText();
				System.out.println(aboutuscss_text);
				
				//by link text
				WebElement aboutus_link = driver.findElement(By.linkText("About Us"));
				String aboutuslink_text = aboutus_class.getText();
				System.out.println(aboutuslink_text);
				
				
				
				
				Thread.sleep(5000);
				driver.close();

	}

}
