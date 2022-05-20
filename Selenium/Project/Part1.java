package module1_project1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Part1 {
	WebDriver driver;
	WebDriver driver1;
	WebDriverWait wait;
	
	@BeforeTest
	public void before_test()
	{
		driver= new FirefoxDriver();
		String url = "https://alchemy.hguy.co/jobs/";
		driver.get(url);
		
		driver1= new FirefoxDriver();
		String url1="https://alchemy.hguy.co/jobs/wp-admin";
		driver1.get(url1);
		wait=new WebDriverWait(driver , Duration.ofSeconds(10));
	}
	
	  
	
	
  @Test
  public void Read_title_verify_text() {
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  assertEquals("Alchemy Jobs – Job Board Application",title);
	 
	  
  }
  
  @Test
  public void read_heading_verify_text()
  {
	  WebElement header = driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/h1"));
	  String header_text = header.getText();
	  System.out.println(header_text);
	  assertEquals("Welcome to Alchemy Jobs",header_text);
  }
  
  @Test
  public void get_header_url()
  {
	  WebElement header_url = driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/div/img"));
	  String header = header_url.getAttribute("src");
	  System.out.println(header);
	  //assertEquals("Welcome to Alchemy Jobs",header_text);
  }
  
  @Test
  public void read_second_heading_verify_text()
  {
	  WebElement header2 = driver.findElement(By.xpath("//*[@id=\"post-16\"]/div/h2"));
	  String header2_text = header2.getText();
	  System.out.println(header2_text);
	  assertEquals("Quia quis non",header2_text);
  }
  
  @Test
  public void navigate_to_jobs_page()
  {
	  WebElement jobs = driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a"));
	  jobs.click();
	  String title = driver.getTitle();
	  System.out.println(title);
  }
  
  @Test
  public void apply_to_job() throws InterruptedException
  {
	  WebElement jobs = driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a"));
	  jobs.click();
	  WebElement search_bar = driver.findElement(By.id("search_keywords"));
	  search_bar.sendKeys("Banking");
	  Thread.sleep(2000);
	  WebElement submit = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input"));
	  submit.click();
	  
	  
	  
	  Thread.sleep(5000);
	  
	  WebElement first_job = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/div[1]/div/span"));
	  first_job.click();
	  
	
	  
	  Thread.sleep(5000);
	  
	  WebElement apply_job = driver.findElement(By.xpath("//*[@id=\"post-4475\"]/div/div/div/div[3]/input"));
	  apply_job.click();
	  
	  WebElement get_mail = driver.findElement(By.xpath("//*[@id=\"post-4475\"]/div/div/div/div[3]/div/p/a"));
	  System.out.println(get_mail.getText());
	  
	
	  
  }
  
  @Test
  public void post_new_job() throws InterruptedException
  {
	  WebElement post_jobs = driver.findElement(By.linkText("Post a Job"));
	  post_jobs.click();
	  
	  WebElement sign_in = driver.findElement(By.xpath("//*[@id=\"submit-job-form\"]/fieldset[1]/div/a"));
	  sign_in.click();
	  
	  Thread.sleep(2000);
	  
	  WebElement username = driver.findElement(By.id("user_login"));
	  username.sendKeys("root");
	  WebElement password = driver.findElement(By.id("user_pass"));
	  password.sendKeys("pa$$w0rd");
	  
	 driver.findElement(By.id("wp-submit")).click();
	 
	 WebElement enter_title = driver.findElement(By.id("job_title"));
	 enter_title.sendKeys("Full Stack Tester");
	 
	 
	 
	 WebElement selectElement = driver.findElement(By.id("job_type"));
		Select select = new Select(selectElement);
		System.out.println(select.isMultiple());
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByIndex(1);
		
		Thread.sleep(2000);
		
		
		
		WebElement bold = driver.findElement(By.xpath("//*[@id=\"mceu_0-button\"]/i"));
		
		bold.click();
		
		
		Thread.sleep(2000);
		
		//WebElement desc = driver.findElement(By.xpath("/html/body/p"));
		
		//WebElement desc = driver.findElement(By.id("_mce_caret"));
		WebElement desc1 = driver.findElement(By.xpath("//*[@id=\"job_description_ifr\"]"));
		
		Thread.sleep(2000);
		
		desc1.sendKeys("Enter new description");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"submit-job-form\"]/p/input[4]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("job_preview_submit_button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"post-5\"]/div/a")).click();
		
		Thread.sleep(2000);
		
		
	 
	  
	  
  }
  
  @Test
  public void login_to_website_backend() throws InterruptedException
  {
	  WebElement username = driver1.findElement(By.id("user_login"));
	  username.sendKeys("root");
	  WebElement password = driver1.findElement(By.id("user_pass"));
	  password.sendKeys("pa$$w0rd");
	  
	  driver1.findElement(By.id("wp-submit")).click();
	  String log_text = driver1.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a")).getText();
	  System.out.println(log_text);
	 
	  
	  
  }
  
  @Test
  public void create_job_listing_using_backend() throws InterruptedException
  {
	  WebElement username = driver1.findElement(By.id("user_login"));
	  username.sendKeys("root");
	  WebElement password = driver1.findElement(By.id("user_pass"));
	  password.sendKeys("pa$$w0rd");
	  
	  driver1.findElement(By.id("wp-submit")).click();
	  String log_text = driver1.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a")).getText();
	  System.out.println(log_text);
	  
	  WebElement job_listing = driver1.findElement(By.xpath("//*[@id=\"menu-posts-job_listing\"]/a/div[3]"));
	  job_listing.click();
	  
	  WebElement add_job = driver1.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a"));
	  add_job.click();
	  
	  Thread.sleep(3000);
	  
	  /*/html/body/div[6]/div/div/div/div/div/div/div/div[2]/div[2]/button
	  
	  Thread.sleep(2000);
	  /html/body/div[6]/div/div/div/div/div/div/div/div[2]/div[2]/button[2]
			  Thread.sleep(2000);
	  /html/body/div[6]/div/div/div/div/div/div/div/div[2]/div[2]/button[2]
			  Thread.sleep(2000);
	  /html/body/div[6]/div/div/div/div/div/div/div/div[2]/div[2]/button[2]
			  Thread.sleep(2000);
	  
	  driver1.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[1]/button/svg")).submit();*/
	  driver1.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[1]/button")).click();
	  
	  
	 /* WebElement company_web = driver1.findElement(By.xpath("//*[@id=\"_company_website\"]"));
	  company_web.sendKeys("new company website");
	  
	  WebElement company_twitter = driver1.findElement(By.xpath("/*[@id=\"_company_twitter\"]"));
	  company_twitter.sendKeys("twitter@company");
	  
	  WebElement job_location = driver1.findElement(By.xpath("//*[@id=\"_job_location\"]"));
	  job_location.sendKeys("London");
	  
	  WebElement company_name = driver1.findElement(By.xpath("//*[@id=\"_company_name\"]"));
	  company_name.sendKeys("New company name");
	  
	  WebElement company_tagline = driver1.findElement(By.xpath("//*[@id=\"_company_tagline\"]"));
	  company_tagline.sendKeys("New company tagline");
	  
	  WebElement url_file_upload = driver1.findElement(By.xpath("//*[@id=\"job_listing_data\"]/div/div/p[8]/span/button[1]"));
	  url_file_upload.click();
	  
	  driver1.findElement(By.xpath("//*[@id=\"__attachments-view-43\"]/li[9]/div/div")).click();
	  
	  driver1.findElement(By.xpath("//*[@id=\"__wp-uploader-id-0\"]/div[4]/div/div[2]/button")).click();*/
	  
	  WebElement position = driver1.findElement(By.xpath("//*[@id=\"post-title-0\"]"));
	  position.sendKeys("New position");
	  
	  driver1.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
	  
	  driver1.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
	  Thread.sleep(2000);
	  
	  
	  driver1.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")).click();
	  
	  Thread.sleep(2000);
	  
	  String text = driver1.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/header/div/h1")).getText();
	  
	  System.out.println(text);
	
	  
	
	  
	  
	
	  
	  
	
	 
	  
	  
  }
  
  
  @AfterTest
  public void after_test()
  {
	  driver.quit();
	  driver1.quit();
  }
}
