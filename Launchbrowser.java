package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 ChromeDriver driver = new ChromeDriver();
 driver.get("http://leaftaps.com/opentaps/control/main");
 driver.manage().window().maximize();
		}
}