package browserTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import connection.DriverConnection;

public class P013_ScreenShot {
	public static void getScreenShot(WebDriver driver,String path) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest =new File(path);
		try {
			FileUtils.copyFile(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		getScreenShot(driver, "D:\\ScreenShot\\ss\\amazon.png");
		System.out.println("ss taken");
		Thread.sleep(2000);
		driver.close();
	}
}
