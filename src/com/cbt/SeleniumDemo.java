package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nasyikatiusupova/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String expected = "Google";
		String actual = driver.getTitle();
		if(expected.equals(actual)) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		System.out.println("expected: \t" + expected);
		System.out.println("actual: \t" + actual);
		
		
	}
	

}
