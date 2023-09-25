package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo43 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.name("policynumber")).sendKeys("123");
Thread.sleep(3000);
driver.findElement(By.id("dob")).click();
Thread.sleep(3000);
WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
Select s=new Select(month);
s.selectByIndex(2);
Thread.sleep(3000);
WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
Select s1=new Select(year);
s1.selectByVisibleText("1999");
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='31']")).click();
Thread.sleep(3000);
driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
driver.findElement(By.id("renew_policy_submit")).click();
WebElement text = driver.findElement(By.id("policynumberError"));
boolean res = text.isDisplayed();
driver.quit();
if(res) {
	System.out.println("error message is displayed");
}else {
	System.out.println("error message is not displayed");
}

	}

}
