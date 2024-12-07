package nov11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTestNGclass {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Running in beforeMethod",true);
	}
	@Test(priority=2)
	public void admin() {
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		Reporter.log("Executing Admin Test",true);
	}
	@Test(priority=0,enabled=false)
	public void pim() {
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		Reporter.log("Executing Pim Test",true);
	}
	@Test(priority=1)
	public void leave() {
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
		Reporter.log("Executing Leave Test",true);
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		Reporter.log("Running in AfterMethod",true);
	}
}
