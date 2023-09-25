package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo64 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/shubh/Desktop/disabled.html");
Thread.sleep(3000);
driver.findElement(By.id("d1")).sendKeys("admin");
Thread.sleep(3000);
RemoteWebDriver r=(RemoteWebDriver) driver;
Thread.sleep(3000);
r.executeScript("document.getElementById('d2').value='manager'");
driver.findElement(By.id("d3")).click();
driver.quit();
	}

}
