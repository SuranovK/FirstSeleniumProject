package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "/Users/asanbaisuranov/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		

	}

}
