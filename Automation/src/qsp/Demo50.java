package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo50 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/shubh/Desktop/hotel.html");
WebElement mtrlistbox = driver.findElement(By.id("mtr"));
Set<String>set=new HashSet();
List<String>al=new ArrayList<>();
Select s=new Select(mtrlistbox);
List<WebElement>alloptions=s.getOptions();
for(int i=0;i<alloptions.size();i++) {
	String text=alloptions.get(i).getText();
	if(!set.add(text)) {
		al.add(text);
	}
	for(String string:al) {
		System.out.println(string);
	}
}
	}

}
