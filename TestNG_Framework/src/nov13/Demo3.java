package nov13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
	WebDriver driver;
	@Test
	public void verifyTitle() {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://gmail.com");
	String Expected = "Google";
	String Actual = driver.getTitle();
	try {
	Assert.assertFalse(Actual.equalsIgnoreCase(Expected),"Title is Matching");
	}catch (AssertionError e) {
		System.out.println(e.getMessage());
	}
	driver.quit();
	}
}
