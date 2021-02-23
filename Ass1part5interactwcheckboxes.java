package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1part5interactwcheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		System.out.println("Language selected");
		
		
		boolean flag = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[2]/div[1]/input[1]")).isSelected();
		if(flag)
			System.out.println("Confirm Selenium is checked");
		else
			System.out.println("Confirm Selenium option is not checked");
		
		boolean check = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[1]/input[1]")).isSelected();
		boolean check2 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]")).isSelected();
		
		if(check)
			{
			driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[1]/input[1]")).click();
			System.out.println("Deselect the selected option");
			}
		else
			System.out.println("Option not selected to continue with Deselect");
		
		if(check2)
			driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]")).click();
			System.out.println("Deselect the selected option");
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[3]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[4]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[5]/input[1]")).click();
		System.out.println(" All Options Selected");
	}

}
