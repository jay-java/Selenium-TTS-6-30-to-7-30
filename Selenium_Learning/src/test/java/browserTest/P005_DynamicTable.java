package browserTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P005_DynamicTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> header_list = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(header_list.size());
		for (int i = 1; i <= header_list.size(); i++) {
			List<WebElement> header_text = driver
					.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th[" + i + "]/span"));
			for (WebElement h : header_text) {
				System.out.print(h.getText() + "	");
			}
		}
		System.out.println();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("rows  : " + rows.size());
		for(int i=2;i<=rows.size();i++) {
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(int c=1;c<=cols.size();c++) {
				WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+c+"]/span"));
				System.out.print(data.getText()+"	");
			}
			System.out.println();
		}
	}
}
