package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
int x=driver.findElement(By.name("login")).getLocation().getX();
int y=driver.findElement(By.name("login")).getLocation().getY();
System.out.println(x);
System.out.println(y);
driver.quit();

	}

}
