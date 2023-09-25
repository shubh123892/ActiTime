package com.actitime.testscript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage3 {
@FindBy(id="username")
private WebElement untbx;
@FindBy(name="pwd")
private WebElement pwtbx;
@FindBy(xpath="//div[text()='Login ']")
private WebElement lgbtn;
public void setLogin(String un,String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
}
}
