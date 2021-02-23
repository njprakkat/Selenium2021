package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1part1hyperlinkpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@link='blue']")).click();
		driver.navigate().back();
		
		String url = driver.findElement(By.xpath("//a[@href='Button.html']")).getAttribute("href");
		System.out.println("URL without clicking : " + url);
		
		driver.findElement(By.partialLinkText("Verify am")).click();
		String title = driver.getTitle();
		if(title.contains(" HTTP Status 404"))
			System.out.println("Verified that the link is Broken");
		
		List<WebElement> linkcount = driver.findElements(By.tagName("a"));
		System.out.println("Total Link counts available in page are :" + linkcount.size());
		
		
		
		
	}

}
 