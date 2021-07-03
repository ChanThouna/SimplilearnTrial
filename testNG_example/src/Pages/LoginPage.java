package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Test.LoginTest;

public class LoginPage {
	
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

	//==================================  Constructor ================================================//
	
	public LoginPage() {
		
		  driver = LoginTest.driver;
		  report = LoginTest.report;
		  test = LoginTest.test;		
		PageFactory.initElements(this.driver, this);
		
	}
//==================================== Web elements =======================================================================//	
	
	
	@FindBy(linkText="Log in")
	WebElement LoginLink;
	@FindBy(name ="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement UserPassword;
	
	@FindBy(className="rememberMe")
	WebElement RememberMe;
	
	@FindBy(name="btn_login")
	WebElement LoginButton;
	
	@FindBy(id="msg_box")
	WebElement Error;
	
	
//==============================================login method=================================================================//
	public void login(String uname,String pass) {

	
		
		LoginLink.click();
	//	test.log(LogStatus.PASS, "Successfully clicked on Login button");
		
	
		
		UserName.sendKeys(uname);
	//	test.log(LogStatus.PASS, "Successfully entered user name ");
		
	
		RememberMe.click();
		
	
		UserPassword.sendKeys(pass);
	//	test.log(LogStatus.PASS, "Successfully entered password ");
		
	
		LoginButton.click();
	//	test.log(LogStatus.PASS, "Successfully clicked on Login Link ");
		
		String ExpectedMessage = "The email or password you have entered is invalid.";
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		Assert.assertTrue(Error.isDisplayed());
		String ErrorMessage = Error.getText();
		String ClassName = Error.getAttribute("class");
		String TagName = Error.getTagName();
	
		System.out.println("Class Name is " + ClassName);
		System.out.println("TagName  is " + TagName);
		
		
		Assert.assertEquals(ErrorMessage, ExpectedMessage);
		//softAssert.assertEquals(ErrorMessage, ExpectedMessage);
		
	}
}
