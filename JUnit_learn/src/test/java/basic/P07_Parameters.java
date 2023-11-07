package basic;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import connection.DriverConnection;

@RunWith(Parameterized.class)
public class P07_Parameters {

	String email;
	String password;

	public P07_Parameters(String email, String password) {
		this.email = email;
		this.password = password;
	}

	static WebDriver driver = null;

	@Before
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void loginTest() {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.sendKeys(email);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
	}

	@Parameters
	public static List<Object[]> data() {
		Object[][] o = new Object[4][2];
		o[0][0] = "incorrect@gmail.com";
		o[0][1] = "incorrect";

		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "incorrect";

		o[2][0] = "incorrect@gmail.com";
		o[2][1] = "incorrect";

		o[3][0] = "incorrect@gmail.com";
		o[3][1] = "incorrect";

		return Arrays.asList(o);
	}

}
