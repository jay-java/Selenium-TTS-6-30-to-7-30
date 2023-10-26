package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class P010_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement mini = driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement td = driver.findElement(By.linkText("Today's Deals"));

		Actions action = new Actions(driver);
		action.moveToElement(mini).build().perform();
		Thread.sleep(2000);
		action.moveToElement(sell).build().perform();
		Thread.sleep(2000);
		action.moveToElement(td).build().perform();
		Thread.sleep(2000);
		driver.close();

	}
}
