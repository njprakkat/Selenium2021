package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaflogin {

		public static void main(String[] args) {
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
 driver.findElement(By.linkText("Create Lead")).click();
 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bank");
 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nimmy");
 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joseph");
 driver.findElement(By.className("smallSubmit")).click();
 String title2 = driver.getTitle();
 System.out.println(title2); 
 driver.close();

	}

		
		
}

