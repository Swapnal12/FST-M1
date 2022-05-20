package SeleniumActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://training-support.net/selenium/tables");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				List<WebElement> cols = driver.findElements(By.xpath("//table[contains (@class ,'striped')]/tbody/tr[1]/td"));
				System.out.println(cols.size());
				
				List<WebElement> rows = driver.findElements(By.xpath("//table[contains (@class ,'striped')]/tbody/tr"));
				System.out.println(rows.size());
				
				List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains (@class ,'striped')]/tbody/tr[3]/td"));
				for (WebElement webElement : thirdRow) {
					System.out.println("Element :"+webElement.getText());
				}
				
				WebElement row2col2 = driver.findElement(By.xpath("//table[contains (@class ,'striped')]/tbody/tr[2]/td[2]"));
				System.out.println(row2col2.getText());
				
				
				
				
				driver.quit();

	}

}
