package week2.day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchIEbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.iedriver().setup();
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		 System.out.println(title);
		
	}

}
