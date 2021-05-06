package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void demo() {
		Reporter.log("Hello Jenkins", true);
	}
}
