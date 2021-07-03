package shopping.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ShoppingTestCase {
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}
	
	@Test
	public void loginTest() {
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Swag Labs");
		
	WebElement userName = driver.findElement(By.xpath("//input[@id ='user-name']"));
	userName.sendKeys("standard_user");
	
	WebElement password = driver.findElement(By.xpath("//input[@id ='password']"));
	password.sendKeys("secret_sauce");
	
	WebElement loginButton = driver.findElement(By.xpath("//input[@id ='login-button']"));
	loginButton.click();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	String  text =  driver.findElement(By.xpath("//span[@class='title']")).getText();
	
	Assert.assertEquals(text, "PRODUCTS","Product text not found in the page ");
	
	System.out.println(text);
			
	}
	
@Test(dependsOnMethods = "loginTest")
	public void addToCart() {
	
	WebElement firstItemName = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	String itemName = firstItemName.getText();
	
	WebElement firsItemPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
	String price = firsItemPrice.getText();
	
	WebElement firstItem = driver.findElement(By.xpath("//button[@id ='add-to-cart-sauce-labs-backpack']"));
	firstItem.click();
	
	WebElement cart = driver.findElement(By.xpath("//a[@class ='shopping_cart_link']"));
	cart.click();
	
	WebElement itemInCart = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
	String itemNameInCart = itemInCart.getText();
	String priceOfItemInCart = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
	
	softAssert.assertEquals(itemNameInCart, itemName,"Difference in expected Item Name ");
	softAssert.assertEquals(priceOfItemInCart, price,"Difference in expected price");

	
	
}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		softAssert.assertAll();
	}
	
	
	
}
