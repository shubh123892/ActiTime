package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 Demo3.testA(driver);
		 WebDriver driver1=new EdgeDriver();
		 Demo3.testA(driver1);
		 WebDriver driver2=new FirefoxDriver();
		 Demo3.testA(driver2);
	}
			
		}
		


