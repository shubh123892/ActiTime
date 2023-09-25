package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
 private WebElement untbx;
 public LoginPage(WebDriver driver) {
	 untbx=driver.findElement(By.id("username"));
 }
 public void setUser(String un) {
	 untbx.sendKeys(un);
 }
}
