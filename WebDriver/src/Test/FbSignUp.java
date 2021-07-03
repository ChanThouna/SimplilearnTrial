package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//WebElement SignUp = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		//SignUp.click();
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
        CreateAccount.click();

		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Leela");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Umang");
		
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("Leela.Umang@gmail.com");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select Birthday = new Select(day);
		Birthday.selectByVisibleText("10");
		
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select BirthMonth = new Select(month);
		Birthday.selectByVisibleText("Mar");
		
		
		
		
		

	}

}
