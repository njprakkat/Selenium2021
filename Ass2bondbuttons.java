package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Ass2bondbuttons {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/Button.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("home")).click();
		// System.out.println("Button clicked to go to Home page");
		 driver.findElement(By.linkText("Button")).click();
		 System.out.println(driver.findElement(By.id("position")).getLocation());
		 System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		 System.out.println(driver.findElement(By.id("size")).getSize());
		 
		 
		
}
}