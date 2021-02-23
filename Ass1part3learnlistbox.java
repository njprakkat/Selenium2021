package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1part3learnlistbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();	
		
		WebElement drpdwn1 = driver.findElement(By.id("dropdown1"));
		Select drpdownindex = new Select(drpdwn1);
		drpdownindex.selectByIndex(1);
		
		WebElement drpdwn2 = driver.findElement(By.name("dropdown2"));
		Select drpdowntext = new Select(drpdwn2);
		drpdowntext.selectByVisibleText("Selenium");
		
		WebElement drpdwn3 = driver.findElement(By.id("dropdown3"));
		Select drpdownvalue = new Select(drpdwn3);
		drpdownvalue.selectByValue("1");
		
		WebElement drpdwn4 = driver.findElement(By.xpath("//div[@class='example']/select[@class='dropdown']"));
		Select cntdrpdwnoption = new Select(drpdwn4);
		List<WebElement> count = cntdrpdwnoption.getOptions();
		System.out.println(count.size());
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[" + 5 + "]/select[" + 1 + "]")).sendKeys("U", Keys.TAB);
		System.out.println("Selected dropdown option using sendKeys");
		
		WebElement drpdwn5 = driver.findElement(By.xpath("(//div[@class='example']/select)[" + 6 + "]"));
		Select multipledrpdwn = new Select(drpdwn5);
		multipledrpdwn.selectByVisibleText("Selenium");
		multipledrpdwn.selectByVisibleText("Appium");
	}
	

}
