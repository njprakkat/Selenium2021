package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass3createLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/login");
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
	 
	 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select srcdrpdwn = new Select(source);
	 srcdrpdwn.selectByVisibleText("Employee");
	 System.out.println(" Employee option selected within Source dropdown");
	 
	 WebElement source2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select cmpdrpdwn = new Select(source2);
	 cmpdrpdwn.selectByValue("9001");
	 System.out.println(" Pay per Click Advertising selected within Marketing Campaign dropdown");
	 
	 
	 WebElement source3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select owndrpdwn = new Select(source3);
	 owndrpdwn.selectByIndex(5);
	 System.out.println(" Corporation selected within Ownership dropdown");
	 
	 
	 WebElement source4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	 Select cntrydrpdwn = new Select(source4);
	 cntrydrpdwn.selectByVisibleText("India");
	 System.out.println(" India selected within Country dropdown");
	 
	 
	 driver.findElement(By.className("smallSubmit")).click();
	 String title2 = driver.getTitle();
	 System.out.println(title2); 
	 driver.close();
	}

}
