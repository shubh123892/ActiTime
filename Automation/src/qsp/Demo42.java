package qsp;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo42 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/shubh/Desktop/naukri.html");
Thread.sleep(4000);
File f=new File("./data/shubham DOCS.docx (1).pdf");
Thread.sleep(4000);
String absolutepath=f.getAbsolutePath();
Thread.sleep(4000);
driver.findElement(By.id("cv")).sendKeys(absolutepath);
Thread.sleep(4000);
driver.quit();
	}

}
