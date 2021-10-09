package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class meera {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.instagram.com/accounts/login/");
	WebElement findElement = driver.findElement(By.xpath("//input[@name='username']"));
	findElement.sendKeys("meera");
	WebElement findElement2 = driver.findElement(By.xpath("//input[@name='password']"));
	findElement2.sendKeys("meera123");
	
	
	
	
}
	
	
	
	
	
	
}
