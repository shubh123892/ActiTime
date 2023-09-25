package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoCrm {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://192.168.80.130:8080/crm/HomePage.do");
driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
driver.findElement(By.id("passWord")).sendKeys("123456");
driver.findElement(By.xpath("//input[@title='Sign In']")).click();
driver.findElement(By.xpath("//a[text()='Logout [rashmi@dell.com]']")).click();
driver.quit();
	}

}
