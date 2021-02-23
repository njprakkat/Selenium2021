package week2.day2;


	import java.util.Scanner;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Ass2EditLeads {
		
	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

			
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		 driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Gopi");
		 System.out.println("Name entered");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 System.out.println(" FIND LEADS BUTTON CLICKED");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		 String text = driver.getTitle();
		 System.out.println("TITLE OF PAGE: " +text);
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" Enter new Company Name");
		 String str = scan.next();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(str);
		 driver.findElement(By.xpath("//td[@colspan='4']//input")).click();
	     String companyname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
	     System.out.println(companyname);
	     if(companyname.contains(str))
	     System.out.println("Company name Updated successfully");
	     //driver.close();
	}

}
