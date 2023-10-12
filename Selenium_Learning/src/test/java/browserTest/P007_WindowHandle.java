package browserTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P007_WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);

		String mainWin = driver.getWindowHandle();
		System.out.println("Main Window : " + mainWin);

		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();

		Set<String> allWin = driver.getWindowHandles();
		for (String w : allWin) {
			if (!w.equals(mainWin)) {
				driver.switchTo().window(w);
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("selenium@gmail.com");

				WebElement btn = driver.findElement(By.name("btnLogin"));
				btn.click();
			}
		}

		Thread.sleep(2000);
//		driver.close();
		driver.quit();

	}
}
