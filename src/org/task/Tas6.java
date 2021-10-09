package org.task;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tas6 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	driver.manage().window().maximize();
WebElement findElement = driver.findElement(By.tagName("table"));
WebElement findElement2 = findElement.findElement(By.tagName("tbody"));
List<WebElement> findElement3 = findElement2.findElements(By.tagName("tr"));
List li =new ArrayList();
Set si = new HashSet();
for (int i =0; i <findElement3.size(); i++) {
	List<WebElement> findElement4 = findElement2.findElements(By.tagName("td"));
	for (int j = 0; j < findElement4.size(); j++) {
		WebElement webElement2 = findElement4.get(i);
		String text = webElement2.getText();
		li.add(text);
		si.add(text);
	}
	si.removeAll(li);
	System.out.println(si);
}

	}}