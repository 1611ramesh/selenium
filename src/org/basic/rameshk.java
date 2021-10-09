package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rameshk {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement.click();
	Thread.sleep(2000);
	WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
	findElement2.sendKeys("ramesh");
	WebElement findElement3 = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
	findElement3.sendKeys("kumar");
	WebElement findElement4 = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
	findElement4.sendKeys("7708147339");
	WebElement findElement5 = driver.findElement(By.xpath("//input[@id='password_step_input']"));
	findElement5.sendKeys("ramesh123");
	WebElement findElement6 = driver.findElement(By.xpath("//option[@value='15']"));
	findElement6.click();
	WebElement findElement7 = driver.findElement(By.xpath("(//option[@value='11'])[2]"));
	findElement7.click();
	WebElement findElement8 = driver.findElement(By.xpath("//option[@value='1995']"));
	findElement8.click();
	WebElement findElement9 = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
	findElement9.click();
	WebElement findElement10 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	findElement10.click();
	
	
}
	
	
	
	
}
