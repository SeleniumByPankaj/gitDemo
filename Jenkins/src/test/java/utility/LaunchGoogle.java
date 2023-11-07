package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchGoogle {

	@Test
	public void LaunchBrowser() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		String pageName = driver.getTitle();

		System.out.println("this is getting printed from github");
		
		System.out.println("Title of the page is " + pageName);

	}
}
