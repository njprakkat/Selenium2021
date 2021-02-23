package week2.day1;

		import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Ass1editfields {

				public static void main(String[] args) {
				// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();  // Launch Chrome browser here using Constructor
		 driver.get("http://leafground.com/pages/Edit.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("test@test.com");
		 System.out.println(" Email id Entered");
		 System.out.println(driver.findElementByName("username").getAttribute("value"));
		 
		 // HAVING ISSUES HERE - . FINDING ELEMENT WITHOUT USING XPATH & .CLEAR() NOT WORKING SOMEHOW
		 driver.findElementByXPath("//input[@value='TestLeaf']").clear();
		 System.out.println(" Text Cleared");
		// driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		// driver.findElement(By.className("chromexPathFinder1")).sendKeys("New text", Keys.TAB);
		
		
      
}
}