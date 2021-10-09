package org.task;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tas3 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	driver.manage().window().maximize();
WebElement findElement = driver.findElement(By.tagName("table"));
WebElement findElement2 = findElement.findElement(By.tagName("thead"));
List<WebElement> findElements3 = findElement2.findElements(By.tagName("th"));
for (int k = (findElements3.size()-1); k >=0 ; k--) {
	WebElement webElement = findElements3.get(k);
	String text = webElement.getText();
	System.out.print(text+"\t");
	}
System.out.println("\n");
WebElement findElement3 = findElement.findElement(By.tagName("tbody"));	
List<WebElement> findElements = findElement3.findElements(By.tagName("td"));

for (int i = 3; i >=0; i--) {
	WebElement webElement = findElements.get(i);
	String text = webElement.getText();
System.out.print(text);

}
System.out.println("\n");
	for (int i = 7; i >=4; i--) {
		WebElement webElement = findElements.get(i);
		String text = webElement.getText();
		System.out.print(text);
	}	
	System.out.println("\n");
		for (int i = 11; i >=8; i--) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.print(text);
		}
		System.out.println("\n");
		for (int i = 15; i >=12; i--) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.print(text);
		}
		System.out.println("\n");
		for (int i = 19; i >=16; i--) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.print(text);
		}
		System.out.println("\n");
		for (int i = 23; i >=20; i--) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.print(text);
		}
		System.out.println("\n");
		for (int i = 27; i >=24; i--) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			System.out.print(text);
		}
	}
	





	}

