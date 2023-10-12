package browserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P008_Iframe {
	public static void main(String[] args) {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getDriver(url);
		// iframe 1
		WebElement iframe1 = driver.findElement(By.xpath("//div[@id='frame1Wrapper']/iframe"));
		System.out.println(iframe1);

		driver.switchTo().frame(iframe1);
		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println("frame : 1 : " + text1.getText());

		// iframe 2
		WebElement iframe2 = driver.findElement(By.xpath("//div[@id='frame2Wrapper']/iframe"));
		System.out.println(iframe2);

		driver.switchTo().frame(iframe2);
		WebElement text2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("frame 2 : " + text2.getText());
	}
}
