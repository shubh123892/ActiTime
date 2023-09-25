package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo17 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String colour=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
String colour1=driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
driver.quit();
System.out.println(colour);
System.out.println(colour1);
	}

}
