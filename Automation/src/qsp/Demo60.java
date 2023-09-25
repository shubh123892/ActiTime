package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo60 {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
Actions a = new Actions(driver);
a.contextClick(target).perform();
Thread.sleep(3000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_W);
Thread.sleep(3000);
driver.quit();
	}

}
