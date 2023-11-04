package basic;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import connection.DriverConnection;

public class P05_AnnotationPractical {
	static String url = "https://www.facebook.com/";
	static WebDriver driver  = null;
	@BeforeClass
	public static void openBrowser() {
		driver = DriverConnection.getDriver(url);
	}
	@Test
	public void titleCheck() {
		String expected = "facebook";
		String actual = driver.getTitle();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@AfterClass
	public static void closeBroser() {
		driver.quit();
	}
}
