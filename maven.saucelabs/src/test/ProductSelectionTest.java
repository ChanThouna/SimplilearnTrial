package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;

public class ProductSelectionTest extends BaseClass {
	
	ProductPage product;
	
	
	@BeforeMethod()
	public void beforeClass() {
		LoginPage login = new LoginPage();
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		login.login(username,password);
		
	}
	
	@Test(description="add product")
	public void productSelectionTest() {
	product = new ProductPage();
	product.selectProduct(1);
	
	}
	
	
	@Test(description="Remove product",dependsOnMethods="productSelectionTest" )
	public void removeProduct() {
			
	product.removeItem();
		
	}
	
	
	

}
