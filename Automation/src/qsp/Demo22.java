package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		try
		{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e)
		{
			
		}
		driver.findElement(By.name("q")).sendKeys("one plus");
		Thread.sleep(3000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//li"));
		Thread.sleep(3000);
		int count =allsugg.size();
		System.out.println(count);
		Thread.sleep(3000);
		for(int i=0;i<count;i++) {
			String text=allsugg.get(i).getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("(//span[contains(text(),'one plus')])[last()]")).click();
	}

}
