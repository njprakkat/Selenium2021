package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass4Acmeuipathlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("leaf@12");
		 System.out.println("Username & password entered");
		 
		 driver.findElementByXPath("//*[@type='submit']").click();
		
		 //driver.findElementByClassName("btn btn-primary").click();
		
		 System.out.println("Login button clicked");
		 System.out.println("Title of the Page is: " +driver.getTitle());
		 driver.findElementByLinkText("Log Out").click();
		 System.out.println("Logged out");
	}

}
