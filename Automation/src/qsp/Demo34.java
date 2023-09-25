package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo34 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
Thread.sleep(3000);
List<WebElement> s1 = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
List<WebElement> s2 = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../..//div[@class='_30jeq3 _1_WHN1']"));
	int count=s1.size();	
	System.out.println(count);
		for(int i=0;i<count;i++) {
			String	text1=s1.get(i).getText();
			String text2=s2.get(i).getText();
			System.out.println(text1+" **********************"+text2);
		}
		
	}

}
