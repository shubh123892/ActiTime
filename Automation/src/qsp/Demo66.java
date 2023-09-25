package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo66 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.vtiger.com/");
WebElement target = driver.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(driver);
a.moveToElement(target).perform();
driver.findElement(By.partialLinkText("Customers")).click();
WebElement target1 = driver.findElement(By.xpath("//span[text()='Login']"));
 a.doubleClick(target1).perform();
 boolean res = driver.findElement(By.xpath("//div[@class='container']")).isDisplayed();
 if(res) {
	 System.out.println("login page is displayed");
 }else {
	 System.out.println("login page is not displayed");
 }
 driver.quit();
	}

}
