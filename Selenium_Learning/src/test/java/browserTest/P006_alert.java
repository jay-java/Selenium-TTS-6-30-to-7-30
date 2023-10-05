package browserTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import connection.DriverConnection;

public class P006_alert {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		//1.Alert
		/*WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();*/
		
		//2.Alert
		/*WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
		alertButton.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();*/
		
		//3.alert
		/*WebElement alertButton = driver.findElement(By.id("confirmButton"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();*/
		
		WebElement alertButton = driver.findElement(By.id("promtButton"));
		alertButton.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("seelnium");
		alert.accept();
	}
}
