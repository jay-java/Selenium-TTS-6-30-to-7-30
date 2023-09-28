package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P002_HTML {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		String expectedResult = "Facebook";
		String actualResult = driver.getTitle();
		System.out.println("actual result : "+actualResult);
		if(expectedResult.equals(actualResult)) {
			System.out.println("test pass");
		}
		else {
			System.out.println("fail");
		}
		WebElement ca = driver.findElement(By.linkText("Create new account"));
		ca.click();
		Thread.sleep(10000);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("selenium");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("java");
		WebElement mNo = driver.findElement(By.name("reg_email__"));
		mNo.sendKeys("987654320");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("selenium@123");
		
//		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("selenium@gmail.com");
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("pass@123");
		
	}
}
