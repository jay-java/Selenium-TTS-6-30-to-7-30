package browserTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P014_PartialLinked {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		System.out.println(links.size());
		links.get(2).click();
		driver.navigate().back();
		
		driver.close();
//		for(WebElement e:links) {
//			System.out.println(e.getText());
//		}
	}
}
