package SeleniumActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://training-support.net/selenium/tables");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th"));
				System.out.println(cols.size());
				
				List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr"));
				System.out.println(rows.size());
				
				
				WebElement row2col2 = driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));
				System.out.println(row2col2.getText());
				
				driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[1]")).click();
				
				WebElement row2col2_2 = driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));
				System.out.println(row2col2_2.getText());
				
				List<WebElement> footer = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tfoot/tr/th"));
				for (WebElement webElement : footer) {
					System.out.println("Element :"+webElement.getText());
				}
				
				
				
				driver.quit();

	}

}
