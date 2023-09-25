package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement login=driver.findElement(By.id("username"));
int height=login.getSize().getHeight();
int width=login.getSize().getWidth();
WebElement login1=driver.findElement(By.name("pwd"));
int height1=login1.getSize().getHeight();
int width1=login1.getSize().getWidth();
driver.quit();
if(height==height1 && width==width1) {
	System.out.println("the height and width of username and password textfield is equal");
}else {
	System.out.println("the height and width of username and password textfield is  not equal");

	}
	}
}


