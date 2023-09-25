package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/shubh/Desktop/demo.html");
driver.findElement(By.linkText("Google")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.partialLinkText("G")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.cssSelector("a[id='d1']")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.cssSelector("a[name='n1']")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.cssSelector("a[class='c1']")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.cssSelector("a[href='https://www.jspiders.com']")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.quit();




	}

}
