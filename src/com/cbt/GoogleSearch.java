package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nasyikatiusupova/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://cybertekschool.com");
		
		String expected = "cybertekschool";
		String actual = driver.getCurrentUrl();
		
		if(actual.contains(expected)) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		System.out.println("expected: \t" + expected);
		System.out.println("actual: \t" + actual);
		 driver.close();
	}

	}


