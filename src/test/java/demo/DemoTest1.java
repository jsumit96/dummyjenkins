package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 extends DemoTest{
	@Test
	public void setup() {
		driver.get("https://www.shutterstock.com/home");
		Reporter.log("Welcome page is displayed", true);
		driver.manage().window().maximize();
		Reporter.log("Welcome page is maximized", true);		
	}
}
