package week2.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1part6Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/table.html");
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
	System.out.println(" NUMBER OF ROWS: " +rows.size());
	
	List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table_id']//tr[2]//td"));
	System.out.println(" NUMBER OF COLS: " +cols.size());
	
	String progress = driver.findElement(By.xpath("//table[@id='table_id']//tr[3]//td[2]")).getText();
	System.out.println(" PROGRESS VALUE OF Learn to Interact with Elements: " +progress);
	
		int small=0;
		for(int i=2; i<=rows.size(); i++)
		{
		
			String percent2 = driver.findElement(By.xpath("//table[@id='table_id']//tr["+ i +"]//td[2]")).getText();
			String rempersign = percent2.replace("%", "");
			if(i==2)
			{
				small = Integer.parseInt(rempersign);
			}
			else
			{
				if(small > Integer.parseInt(rempersign)) {
					small=Integer.parseInt(rempersign);}
			}
				
			System.out.println(rempersign);
			
			
		
				
	    }
	
		System.out.println(small);
		
	}

}
