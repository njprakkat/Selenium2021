package week2.day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Ass3DeleteLEad {
		
	
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
		 System.out.println(" FIND LEADS BUTTON CLICKED");
		 Thread.sleep(4000);
		 //driver.findElement(By.xpath("//li[@class=' x-tab-strip-active ']/a[@href='#']")).click();
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 System.out.println("works");
		 driver.findElement(By.name("phoneNumber")).sendKeys("92");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 System.out.println("Find Leads button clicked");
		 Thread.sleep(4000);
		 String Leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		 System.out.println(" Capturing Lead ID of ID to be deleted: " +Leadid);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		 
		 driver.findElement(By.xpath("//a[@class='subMenuButton']/following-sibling::a[@class='subMenuButtonDangerous']")).click();
		 System.out.println("Delete button clicked");
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		 System.out.println(" FIND LEADS BUTTON CLICKED");
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Leadid);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 System.out.println("Find Leads button clicked");
		 Thread.sleep(4000);
		 
		 String noRecordsTo = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[1]")).getText();
		 if(noRecordsTo.contains("No records"))
			 System.out.println(" Confirmed Deletion of records is successful");
		 else
			 System.out.println(" Deletion of record not successful");
		 
	//	 driver.close();
	}

}
