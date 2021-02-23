package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1part4radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("yes")).click();
		WebElement enable = driver.findElement(By.xpath("//label[@for='Checked']"));
		boolean flag = enable.isEnabled();
		
		if(flag)
		System.out.println(" Default Radio button selected is Checked");
		else
		System.out.println(" Default Radio button selected is Unchecked");	
		
		boolean agegroup = driver.findElement(By.xpath("(//input[@class='myradio'])[4]")).isSelected();
		if(!agegroup)
			driver.findElement(By.xpath("(//input[@class='myradio'])[4]")).click();	
		else
			System.out.println(" Age group choice already selected");
	}

}
