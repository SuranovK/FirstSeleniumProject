package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/nasyikatiusupova/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).sendKeys("SuranovK");
		driver.findElement(By.id("password")).sendKeys("#pass123");
		driver.findElement(By.name("commit")).click();
		
		
		//Thread.sleep(1000);
		//driver.close();
	}

}
