package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addnwbtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement addnwcstmr;
@FindBy(xpath="//input[@placeholder='Enter Customer Name' and  @class]")
private WebElement entercustnmtbx;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement descrtbx;
@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement selectcustmr;
@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
private WebElement bigbang;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement cretcustmrbtn;
@FindBy(xpath="//div[text()='ICICI_001' and @class='title']")
private WebElement actualName;
@FindBy(xpath="//div[text()='+ New Project']")
private WebElement NwPrjBtn;
@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
private WebElement EntrPrjNm;
@FindBy(xpath="//div[@class='customerContainer']")
private WebElement Customer;
@FindBy(xpath="//div[text()='ICICI_001' and @class='itemRow cpItemRow selected']")
private WebElement SelectDrpDwn;
@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Add Project Description']")
private WebElement Description;
@FindBy(xpath="//div[text()='Create Project']")
private WebElement CrtPrjBtn;
@FindBy(xpath="//div[text()='ICICI Bank' and @class='title']")
private WebElement ProjectName;
@FindBy(xpath="//div[text()='+ New Tasks']")
private WebElement TaskBtn;
@FindBy(xpath="//div[@class='searchInputPlaceholder' and @style]")
private WebElement SelectCstmr;
@FindBy(xpath="//div[text()='ICICI_001' and @class='itemRow cpItemRow selected' ]")
private WebElement SelectdrpDwn;


public WebElement getTaskBtn() {
	return TaskBtn;
}
public WebElement getSelectCstmr() {
	return SelectCstmr;
}
public WebElement getSelectdrpDwn() {
	return SelectdrpDwn;
}
public TaskListPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
public WebElement getAddnwbtn() {
	return addnwbtn;
}
public WebElement getAddnwcstmr() {
	return addnwcstmr;
}
public WebElement getEntercustnmtbx() {
	return entercustnmtbx;
}
public WebElement getDescrtbx() {
	return descrtbx;
}
public WebElement getSelectcustmr() {
	return selectcustmr;
}
public WebElement getBigbang() {
	return bigbang;
}
public WebElement getCretcustmrbtn() {
	return cretcustmrbtn;
}
public WebElement getActualName() {
	return actualName;
}
public WebElement getNwPrjBtn() {
	return NwPrjBtn;
}
public WebElement getEntrPrjNm() {
	return EntrPrjNm;
}
public WebElement getCustomer() {
	return Customer;
}
public WebElement getSelectDrpDwn() {
	return SelectDrpDwn;
}
public WebElement getDescription() {
	return Description;
}
public WebElement getCrtPrjBtn() {
	return CrtPrjBtn;
}
public WebElement getProjectName() {
	return ProjectName;
}
 

}
