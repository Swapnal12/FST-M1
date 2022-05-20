package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/target-practice");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				//by id
				
				WebElement thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
		        System.out.println(thirdHeader.getCssValue("color"));
				
				WebElement fifthHeader = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
				
				
				
				WebElement voilet = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]"));
				System.out.println(voilet.getAttribute("class"));
				System.out.println(voilet.getText());
				
				
				WebElement grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
				
				
				
				
				
				
				
				
				
				
				
				Thread.sleep(2000);
				driver.close();

	}

}
