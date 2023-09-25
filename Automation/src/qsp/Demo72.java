package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo72 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Actions a=new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//span[text()='Future Planet']"));
		a.scrollToElement(e).perform();
	}

}
