package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement CustomerID = driver.findElement(By.xpath("//input[@name ='cusid']"));
		
		CustomerID.sendKeys("123253");
		
		WebElement Submit = driver.findElement(By.xpath("//input[@name ='submit']"));
		Submit.click();
		
		Alert alertObj = driver.switchTo().alert();
		alertObj.accept();
		
		Alert alertObj1 = driver.switchTo().alert();
		alertObj1.accept();
	
		
	//	driver.switchTo().defaultContent();
		
		
	}

}
