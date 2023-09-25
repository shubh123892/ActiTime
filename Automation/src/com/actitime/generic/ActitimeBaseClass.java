package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackpage;
import com.actitime.pom.LoginPage;

public class ActitimeBaseClass {
public static WebDriver driver;
@BeforeTest
public void openBrowser() {
	Reporter.log("open browser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterTest
public void closeBrowser() {
	Reporter.log("close browser",true);
	driver.close();
}
@BeforeMethod
public void login() throws IOException {
	Reporter.log("login",true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pw = f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pw);
}
@AfterMethod
public void logout() throws InterruptedException {
	Reporter.log("logout",true);
	Thread.sleep(3000);
	EnterTimeTrackpage e=new EnterTimeTrackpage(driver);
	Thread.sleep(3000);
	e.setLogout();
}
}

