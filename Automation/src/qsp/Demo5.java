package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args)throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/shubh/Desktop/demo.html");
driver.findElement(By.tagName("a")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.id("d1")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.name("n1")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.className("c1")).click();
Thread.sleep(2000);
String title=driver.getTitle();
System.out.println(title);
driver.quit();
	}

}
