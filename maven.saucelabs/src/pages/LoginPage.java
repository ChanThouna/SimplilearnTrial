package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Helpers.SwagLabsText;
import test.LoginTest;

public class LoginPage {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	public LoginPage() {
		
		  driver = LoginTest.driver;
		  report = LoginTest.report;
		  test = LoginTest.test;		
		PageFactory.initElements(this.driver, this);
		
	}
	
	
	@FindBy(id = "user-name")
	WebElement Username;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(id ="login-button")
	WebElement LoginButton;
	
	@FindBy(className= "title")
	WebElement HomepageTitle;
	
	
	public void login(String username,String password) {
		
		test = report.startTest("Login Test Case");
		
		Username.sendKeys(username);
		Password.sendKeys(password);
		LoginButton.click();
		
		String homepageTitle = HomepageTitle.getText();
		System.out.println(SwagLabsText.HOMEPAGE_TITLE);
		
		System.out.println(homepageTitle);
		Assert.assertEquals(homepageTitle,SwagLabsText.HOMEPAGE_TITLE ,"Difference in expected Hompage title");
		
		
		
		
		
	}
	
	
	

}
