package test;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;
	
import page.LoginPage;
	
	@Listeners(TestNgListenerExample.class)	
	public class LoginTest extends BaseClass{
		
		
				
		@Test
		public void LoginTestcase() {
			LoginPage Loginobj = new LoginPage();
			
			String uname = sheet.getRow(1).getCell(0).getStringCellValue();
			String pass = sheet.getRow(1).getCell(1).getStringCellValue();
			
			System.out.println(" username is " + uname);
			System.out.println("password is " + pass);
			
			
			Loginobj.login(uname, pass);
					
		}
		
		
	}


