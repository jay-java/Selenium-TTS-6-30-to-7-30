package browserTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class P002_FBRegister {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
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
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("selenium");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("java");
		WebElement mNo = driver.findElement(By.name("reg_email__"));
		mNo.sendKeys("987654320");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("selenium@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("3");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("12");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(5);
		
		List<WebElement> list = driver.findElements(By.name("sex"));
		System.out.println(list.size());
		list.get(1).click();
		
//		for(WebElement e : list) {
//			String s = e.getText();
//			System.out.println(s);
//		}
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
//		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("selenium@gmail.com");
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("pass@123");
		
	}
}
