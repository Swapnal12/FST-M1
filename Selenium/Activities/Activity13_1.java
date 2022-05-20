package SeleniumActivities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity13_1 {

	public static void main(String[] args) throws InterruptedException, IOException,CsvException {
		CSVReader reader=new CSVReader(new FileReader("./sample.csv"));
		List<String[]> list = reader.readAll();
		System.out.println("Total number of rows are :"+list.size());
		
		Iterator<String[]> itr = list.iterator();
		
		while(itr.hasNext())
		{
			String[] str = itr.next();
			
			
			System.out.println("Values are :");
			for(int i=0;i<str.length;i++)
			{
				System.out.println(" "+str[i]);
				
			}
			System.out.println(" ");
			
		}
				
			
			
		reader.close()	;	

	}

}
