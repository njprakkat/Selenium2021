package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1part2Interactwthimages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12')]//img")).click();
		System.out.println("IMAGE CLICKED");
		driver.navigate().back();
		// HOW  TO FIND IF ITS A BROKEN IMAGE ??
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
		System.out.println("LINK CLICKED");
	}

}
