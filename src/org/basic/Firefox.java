package org.basic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.youtube.com/");
		
	}
	

}
