package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.BaseClass;

public class ProductPage {
	
	WebDriver driver;
	ExtentReports report; 
	ExtentTest test;
	
	
	
	
	

	public ProductPage() {
		driver = BaseClass.driver;
		report = BaseClass.report;
		test = BaseClass.test;
	//	PageFactory.initElements(driver, this);
	}
	
	public void selectProduct(int index) {
		
		WebElement productToAdd = driver.findElement(By.xpath("//*[@class='inventory_item_name']//following::button[1]"));
		productToAdd.click();
		
		WebElement cart = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
		Assert.assertTrue(Integer.parseInt(cart.getText())>0,"Cart value is not greator than 0");
			
	}
	public void removeItem() {
		
		WebElement productToAdd = driver.findElement(By.xpath("//*[@class='inventory_item_name']//following::button[1]"));
		productToAdd.click();
		WebElement removeItem = driver.findElement(By.xpath("//*[@class='btn btn_secondary btn_small btn_inventory']"));
		removeItem.click();
		WebElement cart = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
		Assert.assertTrue(cart.getText().isEmpty(),"Cart value is not updated after removing");
	}
	
	

}
