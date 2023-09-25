package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
System.out.println(ele.getAttribute("src"));
driver.quit();
	}

}
