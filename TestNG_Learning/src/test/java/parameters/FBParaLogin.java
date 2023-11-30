package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FBParaLogin {
	static WebDriver driver;

	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test(dataProvider = "dp")
	public void test(String email, String pass) {
		WebElement emailele = driver.findElement(By.id("email"));
		emailele.clear();
		emailele.sendKeys(email);
		WebElement passele = driver.findElement(By.id("pass"));
		passele.clear();
		passele.sendKeys(pass);
	}

	@DataProvider(name = "dp")
	public static Object[][] dataProviderMethod() {
		Object[][] obj = new Object[2][2];

		obj[0][0] = "coorect@gmail.com";
		obj[0][1] = "coorect@gmail.com";
		
		obj[1][0] = "incoorect@gmail.com";
		obj[1][1] = "incoorect@gmail.com";
		
		return obj;
	}
	
	
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}

}

