package org.basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iphone", Keys.ENTER);
	String windowHandle = driver.getWindowHandle();
	driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - (Product) RED']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) 
		if (!windowHandle.equals(string)) {
			driver.switchTo().window(string);
			driver.findElement(By.id("add-to-cart-button")).click();
		}
	}
	
	
	}
	

	
	
	

