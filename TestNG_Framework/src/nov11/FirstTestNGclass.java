package nov11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FirstTestNGclass {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Running in beforetest",true);
	}
	@Test
	public void admin() {
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Reporter.log("Executing Admin Test",true);
	}
	@Test
	public void pim() {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Reporter.log("Executing Pim Test",true);
	}
	@Test
	public void leave() {
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Reporter.log("Executing Leave Test",true);
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		Reporter.log("Running in aftertest",true);
	}

}
