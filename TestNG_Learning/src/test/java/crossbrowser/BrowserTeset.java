package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTeset {
	@Parameters("browser")
	@Test
	public void test(String browser) {
		WebDriver driver;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jay-pc\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
		if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\jay-pc\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
	}
}
