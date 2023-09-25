package qsp;

import org.openqa.selenium.WebDriver;

public class Demo3 {
     static void testA(WebDriver driver) {
    	 driver.get("https://www.google.com/");
    	 String Title=driver.getTitle();
    	 System.out.println(Title);
    	 driver.close();
     }
	}


