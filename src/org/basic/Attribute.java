package org.basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Attribute {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.4");
	WebElement findElement = driver.findElement(By.xpath("//div[contains(text(),'The')]"));
	File s = findElement.getScreenshotAs(OutputType.FILE);
	File d = new File("C:\\Users\\1611r\\Desktop\\selenium class\\screenshot\\fb2.png");
	FileUtils.copyFile(s, d);

	  
}
	
	
}
