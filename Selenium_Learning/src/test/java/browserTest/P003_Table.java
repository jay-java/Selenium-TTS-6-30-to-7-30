package browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P003_Table {
	public static void main(String[] args) {
		String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement ele  =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]/span"));
		String text = ele.getText();
		System.out.println(text);
	}
}
