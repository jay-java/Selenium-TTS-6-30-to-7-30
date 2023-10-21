package browserTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P009_Calender {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(iframe);
		System.out.println("switched to iFrame");
		
		Thread.sleep(3000);
		WebElement date_picker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date_picker.click();
		System.out.println("clicked");
		String myDate = "14";
		String myMonth = "May";
		String myYear = "2027";
		WebElement current_Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		String currentY = current_Year.getText();
		System.out.println(currentY);
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentY);
		while(!myYear.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText())) {
			if(y1>y2) {
				WebElement next = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span"));
				next.click();
			}
			else {
				WebElement prev = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span"));
				prev.click();
			}
			
		}
		while(!myMonth.equals(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText())) {
			if(y1>y2) {
				WebElement next = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span"));
				next.click();
			}
			else {
				WebElement prev = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a[1]/span"));
				prev.click();
			}
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement date:dates) {
			String d = date.getText();
			if(d.equals(myDate)) {
				date.click();
			}
		}
		
		
		
		
		
		
		/*
		
		List<WebElement> row_list = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
//		System.out.println(row_list.size());
		for(int i=1;i<=row_list.size();i++) {
			List<WebElement> col_list = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td"));
//			System.out.println(col_list.size());
			for(int j =1;j<=col_list.size();j++) {
				List<WebElement> data_list = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]"));
//				System.out.println(data_list.size());
				for(WebElement single_ele: data_list) {
					String data = single_ele.getText();
					System.out.println(data);
					if(data.equals(myDate)) {
						single_ele.click();
					}
				}
			}
		}*/
	}
}
