package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("WebDriver.chrome.driver", "Chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement FileUpload = driver.findElement(By.xpath("http://demo.guru99.com/test/upload/"));
			FileUpload.sendKeys("/home/chanchanbinagma/Documents/");
			

	}

}
