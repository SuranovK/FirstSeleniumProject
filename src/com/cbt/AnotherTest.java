package com.cbt;

import java.util.prefs.BackingStoreException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nasyikatiusupova/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
			
		String expected = "cybertekschool jdd";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected)) {
		System.out.println("passed");
	}else {
		System.out.println("failed");
		
		
		
	
	System.out.println("expected: \t" + expected);
	System.out.println("actual: \t" + actual);
	}
	Thread.sleep(10000);	
	 driver.close();
		
	 

	}

}
