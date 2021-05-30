package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//	driver.findElement(By.linkText("English (UK)")).click();

		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("123456");
		
		// driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
//	String CreateUser = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).getText();
//		 
//		 System.out.println(CreateUser);
		 
//	WebElement CreateUser  = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		 
//		 System.out.println(CreateUser.getText());
//		
//		WebElement CreateUser  = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));	 
//		 System.out.println(CreateUser.getText());
		 
		 
		 WebElement CreateUser  = driver.findElement(By.xpath("//a[text()='Create New Account']"));	 
		 System.out.println(CreateUser.getText());	 
		 
		 	 
		driver.close();
		
		
		
		
		
		

	}

}
