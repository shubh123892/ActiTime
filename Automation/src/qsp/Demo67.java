package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo67 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
Scanner sc=new Scanner(System.in);
System.out.println("enter the dish name");
String dish = sc.nextLine();
driver.get("file:///C:/Users/shubh/Desktop/hotel.html");
Thread.sleep(2000);
WebElement mtr = driver.findElement(By.id("mtr"));
Select s=new Select(mtr);
int count = 0;
List<WebElement> alloptions = s.getOptions();
for(int i=0;i<alloptions.size();i++) {
	String text = alloptions.get(i).getText();
	if(dish.equalsIgnoreCase(text)) {
		count++;
		break;
	}
	
}
if(count>0) {
	System.out.println(dish+" is present in thr dropdown");
}else {
	System.out.println(dish+ " is not present in the dropdown");
}
	}

}
