package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetAuthenticationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nasyikatiusupova/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		String expectation = "welcome";
		
		driver.navigate().to("http://testing-ground.scraping.pro/login");
		driver.findElement(By.name("usr")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		
		driver.findElement(By.cssSelector("#case_login > form:nth-child(2) > input:nth-child(5)")).click();;
		
		
		
		
		
	
		
		
		

	}

}
