package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo47 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
driver.quit();
	}

}
