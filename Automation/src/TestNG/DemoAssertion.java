package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class DemoAssertion {
	public void verifyTitle() {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
String etitle = "Soogle";
String atitle = driver.getTitle();
SoftAssert s=new SoftAssert();
s.assertEquals(atitle,etitle);
driver.quit();
s.assertAll();

}
}
