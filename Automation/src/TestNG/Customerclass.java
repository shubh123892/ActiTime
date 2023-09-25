package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customerclass {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open browser",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test(priority=1,invocationCount=2)
	public void editcustomer() {
		Reporter.log("edit customer",true);
	}
	@Test
	public void registercustomer() {
		Reporter.log("register customer",true);
	}
	@Test
	public void deletecustomer() {
		Reporter.log("delete customer",true);
	}
}
	


