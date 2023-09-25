package com.actitime.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.ActitimeBaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackpage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImmplementation.class)

public class CustomerModule extends ActitimeBaseClass {
	@Test
	public void CreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("create customer",true);
		EnterTimeTrackpage e=new EnterTimeTrackpage(driver);
		e.setTaskTab();
	
		TaskListPage t=new TaskListPage(driver);
		t.getAddnwbtn().click();
		t.getAddnwcstmr().click();
		FileLib f=new FileLib();
        String customerName = f.getExcelData("CreateCustomer", 1, 0);
		t.getEntercustnmtbx().sendKeys(customerName);
		String customerdesc = f.getExcelData("CreateCustomer", 1, 1);
		t.getDescrtbx().sendKeys(customerdesc);
		t.getSelectcustmr().click();
		Thread.sleep(5000);
		t.getBigbang().click();
		Thread.sleep(5000);
		t.getCretcustmrbtn().click();
		Thread.sleep(5000);		
		String customerActualName = t.getActualName().getText();
		Assert.assertEquals(customerName,customerActualName);
		t.getAddnwbtn().click();
		Thread.sleep(5000);
		t.getNwPrjBtn().click();
		Thread.sleep(3000);
		String projectName = f.getExcelData("CreateProject", 1, 0);
		Thread.sleep(5000);
		t.getEntrPrjNm().sendKeys(projectName);
		Thread.sleep(5000);
		t.getCustomer().click();
		Thread.sleep(5000);
		String desc = f.getExcelData("CreateProject", 1, 1);
		Thread.sleep(5000);
		t.getDescription().sendKeys(desc);
		Thread.sleep(5000);
		t.getCrtPrjBtn().click();
		Thread.sleep(5000);
		String ActualProjectNm = t.getProjectName().getText();
		Assert.assertEquals(projectName, ActualProjectNm);
		Thread.sleep(5000);
		t.getAddnwbtn().click();
		Thread.sleep(5000);
		t.getTaskBtn().click();
		Thread.sleep(5000);
		t.getSelectCstmr().click();
		Thread.sleep(5000);
		t.getSelectdrpDwn().click();
		Thread.sleep(5000);
		
		
		
		
	
		
		
	
	}

}
