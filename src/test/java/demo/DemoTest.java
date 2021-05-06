package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoTest {
	public WebDriver driver;
	@BeforeMethod
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit Jain\\Desktop\\Selenium Workspace\\zzzzDemoProject\\src\\main\\resources\\chromedriver.exe");
		driver= new ChromeDriver();		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
