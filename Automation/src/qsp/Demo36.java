package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo36 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new  ChromeDriver();
driver.get("file:///C:/Users/shubh/Desktop/hotel.html");
WebElement mtrlistbox=driver.findElement(By.id("mtr"));
Select s= new Select(mtrlistbox);
List<WebElement>alloptions=s.getOptions();
int count=alloptions.size();
for(int i=0;i<count;i++) {
	Thread.sleep(500);
	s.selectByIndex(i);
}
for(int i=count-1;i>=0;i--) {
	Thread.sleep(500);
	s.deselectByIndex(i);
}
driver.quit();
	}

}
