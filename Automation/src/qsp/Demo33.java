package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo33 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
Thread.sleep(3000);
List<WebElement> allurl = driver.findElements(By.tagName("a"));
int count=allurl.size();
System.out.println(count);
for(int i=0;i<count;i++) {
String text=allurl.get(i).getAttribute("href");
System.out.println(text);
	}
driver.quit();

}
}
