package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo41 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.quit();

	}

}
