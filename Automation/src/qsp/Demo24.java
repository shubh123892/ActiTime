package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo24 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("java");
Thread.sleep(3000);
List<WebElement> ele = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
int count=ele.size();
System.out.println(count);
for(int i=0;i<count;i++) {
String text=ele.get(i).getText();
System.out.println(text);
	}
ele.get(0).click();
Thread.sleep(3000);
driver.quit();
	}

}
