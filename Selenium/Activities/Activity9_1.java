package SeleniumActivities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://training-support.net/selenium/selects");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement selected = driver.findElement(By.id("single-value"));
				
				WebElement select = driver.findElement(By.id("single-select"));
				Select single_select =new Select(select);
				
				single_select.selectByVisibleText("Option 2");
				System.out.println(selected.getText());
				
				single_select.selectByIndex(2);
				System.out.println(selected.getText());
				
				single_select.selectByValue("4");
				System.out.println(selected.getText());
				
				List<WebElement> options = single_select.getOptions();
				
				for (WebElement option : options) {
					System.out.println(option.getText());
				}
				
				driver.quit();

	}

}
