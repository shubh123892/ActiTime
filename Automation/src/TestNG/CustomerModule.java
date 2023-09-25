package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
	public void createCustomeer() {
		Reporter.log("create customer",true);		
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("delete customer",true);
	
}
}
