package testng.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest1 {
	
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		report = new ExtentReports("ExtentReport.html");
		
	}
	
	
	@Test(description= "Login Test",groups = {"Sanity"})
	public void loginTest() {

				test = report.startTest("Login Test Case");
			
				WebElement LoginLink = driver.findElement(By.linkText("Log in"));
				
				LoginLink.click();
				test.log(LogStatus.PASS, "Successfully clicked on Login button");
				
				WebElement UserName = driver.findElement(By.name("user_login"));
				
				UserName.sendKeys("chanchanbina@gmail.com");
				test.log(LogStatus.PASS, "Successfully entered user name ");
				
				WebElement RememberMe = driver.findElement(By.className("rememberMe"));
				RememberMe.click();
				
				WebElement UserPassword = driver.findElement(By.name("user_pwd"));
				UserPassword.sendKeys("qwerty");
				test.log(LogStatus.PASS, "Successfully entered password ");
				
				WebElement LoginButton = driver.findElement(By.name("btn_login"));
				LoginButton.click();
				test.log(LogStatus.PASS, "Successfully clicked on Login Link ");
				
				String ExpectedMessage = "The email or password you have entered is invalid.";
				
				WebElement Error = driver.findElement(By.id("msg_box"));
				
				Assert.assertTrue(Error.isDisplayed());
				String ErrorMessage = Error.getText();
				String ClassName = Error.getAttribute("class");
				String TagName = Error.getTagName();
			
				System.out.println("Class Name is " + ClassName);
				System.out.println("TagName  is " + TagName);
				
				
			//	Assert.assertEquals(ErrorMessage, ExpectedMessage);
				softAssert.assertEquals(ErrorMessage, ExpectedMessage);
			
				
//				
//				try {
//				Assert.assertEquals(ErrorMessage, ExpectedMessage + "..");
//				test.log(LogStatus.PASS, "Validation passed ");
//
//				}catch(Throwable e) {
//					test.log(LogStatus.FAIL, "Validation failed ");
//				}

			 List<WebElement> list = driver.findElements(By.tagName("input"));
			 
			 System.out.println(list.size());

			 
			 List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
			 		
			 System.out.println("List of links "  + listOfLinks.size());
			 

				
	driver.close();	
				
	}
	
	@AfterMethod
	public void tearDown() {
		report.endTest(test);
		report.flush();
		driver.quit();
		softAssert.assertAll();
	}

}
