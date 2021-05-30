package Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args) {

 System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		
		UserName.sendKeys("chanchanbina@gmail.com");
		
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		WebElement UserPassword = driver.findElement(By.name("user_pwd"));
		UserPassword.sendKeys("qwerty");
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		String ExpectedMessage = "The email or password you have entered is invalid.";
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ErrorMessage = Error.getText();
		String ClassName = Error.getAttribute("class");
		String TagName = Error.getTagName();
	
		System.out.println("Class Name is " + ClassName);
		System.out.println("TagName  is " + TagName);
		
		if(ErrorMessage.equals(ExpectedMessage)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}

	 List<WebElement> list = driver.findElements(By.tagName("input"));
	 
	 System.out.println(list.size());
	 
//	 for(WebElement m : list) {
//		 System.out.println(m);
//		 
//	 }
	 
	 List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
	 		
	 System.out.println("List of links "  + listOfLinks.size());
	 
 
	 for(int i = 0; i< listOfLinks.size(); i++) {
		 System.out.println(" link text is " + listOfLinks.get(i).getText());
	 }
		
		

		
driver.close();	
		

}
}
