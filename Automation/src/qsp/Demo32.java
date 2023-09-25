package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo32 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(3000);
WebElement daylistbox = driver.findElement(By.id("day"));
WebElement monthlistbox=driver.findElement(By.id("month"));
WebElement yearlistbox=driver.findElement(By.id("year"));
Select s=new Select(daylistbox);
Select s1=new Select(monthlistbox);
Select s2=new Select(yearlistbox);
s.selectByValue("31");
Thread.sleep(3000);
s1.selectByIndex(2);
Thread.sleep(3000);
s2.selectByVisibleText("1999");
Thread.sleep(3000);
driver.quit();

	}

}
