package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
//driver.get("https://www.facebook.com/");
driver.get("https://www.instagram.com/");
Thread.sleep(5000);
//WebElement res=driver.findElement(By.name("login"));
WebElement res=driver.findElement(By.xpath("//div[text()='Log in']/.."));
boolean b=res.isEnabled();
driver.quit();
if(b) {
	System.out.println("login button is working");
}
else {
	System.out.println("login button is not working");
}
	}

}
