package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass4duplicatelead {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().window().maximize();
	
	 
	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
	 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	 System.out.println(" FIND LEADS BUTTON CLICKED");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//span[text()='Email']")).click();
	 System.out.println("works");
	 driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 Thread.sleep(4000);
	 String Fname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
	 System.out.println("Name of first resulting Lead :" +Fname);
	 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
	 driver.findElement(By.linkText("Duplicate Lead")).click();
	 String title = driver.getTitle();
	 if(title.contains("Duplicate Lead"))
	 System.out.println("Title Verified & Matches");
	 else
     System.out.println("Title doesnt match");
	 driver.findElement(By.name("submitButton")).click();
	 System.out.println("Create Lead button clicked");
	 String Fnameduplicate = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	 if(Fnameduplicate.equals(Fname))
	 System.out.println("Duplicated lead name is same as captured name");	 
	 else
	 System.out.println("Names dont match");	
	 
	}
}
/*

driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[3]")).click();
*/
