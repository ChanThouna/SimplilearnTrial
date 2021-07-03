package AmazonSearch;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 

public class Search {
	static String searchCategory;
	static String searchText;

	public static void main(String[] args) throws ClassNotFoundException {
	
// Connecting to DB and getting the values 		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce1","root","root");
			
			Statement stmt =  con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Amazon");
			
			while(rs.next()) {
				
				searchCategory = rs.getString(2);
				 searchText = rs.getString(3);
			}
			
		
		System.out.println(searchCategory + " " + searchText);
					
		
	}catch (SQLException e) {
				e.printStackTrace();
			}
		
		
// Launching the WebDriver in Chrome Browser 
		
		System.setProperty("WebDriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
       WebElement searchDropDown = driver.findElement(By.xpath("//select[@id ='searchDropdownBox']"));
       
       Select option = new Select(searchDropDown);
       option.selectByVisibleText(searchCategory);
       
       driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

       WebElement text = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
       text.sendKeys(searchText);
       text.sendKeys(Keys.RETURN);
       
       List<WebElement> mobiles = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
       System.out.println(" The number of Mobiles shown in the screen is " + mobiles.size());
       
       
       //Print the Names of the Mobile on the screen 
       
       
       System.out.println("---------------------------Start of the list of Mobiles ---------------------------------------");
       for(WebElement m : mobiles) {
    	String nametext =  m.getText();
    	int indexNum = nametext.indexOf('₹');
    	System.out.println(nametext.substring(0,indexNum-1));
       }
      System.out.println("---------------------------End of the list of Mobiles ---------------------------------------");
       
       // Take Screenshot of the page
       TakesScreenshot TsObj = (TakesScreenshot) driver;
		
		File myFile = TsObj.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(myFile,  new File("test.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//process to compare the count shown in the screen and the list of mobile count
		
		WebElement countFromScreen = driver.findElement(By.xpath("//*[contains(text(),'results for')]"));
			
		System.out.println(countFromScreen.getText().substring(2, 4));
		
		int actualCount = Integer.parseInt(countFromScreen.getText().substring(2, 4));
		
       if(mobiles.size() == actualCount) {
    	   System.out.println("The number of mobile count is correct");
       }else {
    	   System.out.println("The number of Mobile count is wrong");
       }
		
		driver.close();

	}
	

}
