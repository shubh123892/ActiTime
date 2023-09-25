package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo59 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("About your actiTIME")).click();
Thread.sleep(2000);
 driver.findElement(By.linkText("Read Service Agreement")).click();
Thread.sleep(2000);
Set<String> handles = driver.getWindowHandles();
for(  String wh:handles) {
	driver.switchTo().window(wh);
	Thread.sleep(2000);
}
Thread.sleep(5000);
List<WebElement> allheadings = driver.findElements(By.xpath("//h2"));
Thread.sleep(2000);
System.out.println(allheadings.size());
Thread.sleep(2000);
for(int i=0;i<allheadings.size();i++) {
	String text = allheadings.get(i).getText();
	System.out.println(text);
}
Iterator<String>i=handles.iterator();
String parentid = i.next();
String childid = i.next();
driver.switchTo().window(parentid);
driver.close();
Thread.sleep(2000);
driver.quit();


	}

}
