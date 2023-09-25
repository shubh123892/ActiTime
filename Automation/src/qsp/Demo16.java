package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement fb=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	fb.click();
	Thread.sleep(5000);
	int x=fb.findElement(By.xpath("//label[text()='Female']")).getLocation().getX();
	int y=fb.findElement(By.xpath("//label[text()='Male']")).getLocation().getX();
	int z=fb.findElement(By.xpath("//label[text()='Custom']")).getLocation().getX();
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	driver.quit();
	if(x==y && y==z){
		System.out.println("gender radio buttons are properly alligned");
	}else {
		System.out.println("gender radio buttons are not properly alligned ");
	}
		
	}

}
