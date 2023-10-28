package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P012_Scroll {
	public static void main(String[] args) {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//1.scroll by pixels
//		js.executeScript("window.scrollBy(0,350)", "");
		
		//2.scroll by element
//		WebElement mobile  = driver.findElement(By.xpath("//div[@id='desktop-btf-grid-3']/div"));
//		js.executeScript("arguments[0].scrollIntoView();", mobile);
		
		
		//3.scroll by window
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
}
