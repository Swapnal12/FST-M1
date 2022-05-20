package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

}
