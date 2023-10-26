package browserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import connection.DriverConnection;

public class P011_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		System.out.println("switched to iframe");

		WebElement from = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement to = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions action = new Actions(driver);

		Action e1 = action.clickAndHold(from).moveToElement(to).build();

		e1.perform();
		Thread.sleep(2000);
		driver.close();
	}
}
