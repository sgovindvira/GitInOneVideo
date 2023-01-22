package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sanjay/eclipse-workspace/Test/Drivers/chromedriver");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	String tile = driver.getTitle();
	System.out.println(tile);
	
	driver.quit();

	}

}
