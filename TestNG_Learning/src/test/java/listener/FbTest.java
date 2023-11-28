package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FbTest {

	@Test(priority = 1)
	public void titleCheck(ITestContext i) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		i.setAttribute("myDriver", driver);
		assertEquals(driver.getTitle(), "Fb");
	}

	@Test(priority = 2)
	public void login(ITestContext i) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		assertEquals(driver.getTitle(), "Fb");
	}

}
