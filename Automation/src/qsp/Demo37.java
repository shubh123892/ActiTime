package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo37 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/shubh/Desktop/hotel.html");
WebElement mtrlistbox=driver.findElement(By.id("mtr"));
Select s=new Select(mtrlistbox);
String text=s.getWrappedElement().getText();
System.out.println(text);
driver.quit();
	}

}
