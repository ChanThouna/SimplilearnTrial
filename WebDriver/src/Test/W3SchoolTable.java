package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id ='customers']/tbody/tr"));
		
	   System.out.println("The number of Rows is " +Rows.size() );
	   
	   List<WebElement> Columns = driver.findElements(By.xpath("//table[@id ='customers']//th"));
		
	   System.out.println("The number of Rows is " + Columns.size() );
	   
	  // WebElement text = driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr[4]/th[1]"));
	   
	   WebElement data = driver.findElement(By.xpath("//table[@id = 'customers'] /tbody/tr[4]/td[1]"));
	   System.out.println(data.getText());
	   
	   
	   WebElement ScrollElem = driver.findElement(By.xpath("//h2[text()='HTML Table - Collapsed Borders']"));
       
       JavascriptExecutor obj = (JavascriptExecutor) driver;
       
       obj.executeScript("arguments[0].scrollIntoView();", ScrollElem);
       
       ScrollElem.click();
	   

	}

}
