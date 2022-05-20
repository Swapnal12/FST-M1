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

public class Activity9_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
			
				WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
				driver.get("https://training-support.net/selenium/selects");
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				
				WebElement selected = driver.findElement(By.id("multi-value"));
				
				WebElement select = driver.findElement(By.id("multi-select"));
				Select multi_select =new Select(select);
				
				multi_select.selectByVisibleText("Javascript");
				System.out.println(selected.getText());
				
				multi_select.selectByValue("node");
				System.out.println(selected.getText());
				
				multi_select.selectByIndex(3);
				System.out.println(selected.getText());
				
				multi_select.selectByIndex(4);
				System.out.println(selected.getText());
				
				multi_select.selectByIndex(5);
				System.out.println(selected.getText());
				
				multi_select.deselectByValue("node");
				System.out.println(selected.getText());
				
				multi_select.deselectByIndex(6);
				
				multi_select.getFirstSelectedOption();
				List<WebElement> allSelectedOptions = multi_select.getAllSelectedOptions();
				
				for (WebElement selected_option : allSelectedOptions) {
					System.out.println(selected_option.getText());
				}
				
				multi_select.deselectAll();
				System.out.println(selected.getText());
				
				
				driver.quit();

	}

}
