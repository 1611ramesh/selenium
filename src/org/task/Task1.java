package org.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Task1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	findElement.click();
	Thread.sleep(2000);

		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select = new Select(findElement2);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		for (int i = 0; i <size; i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
	{
				List li =new ArrayList();
				li.add(text);
				
				
			Set si = new HashSet();
			si.add(text);
			boolean contains = li.containsAll(si);
			System.out.println(contains);
			}
			}
		}
	
	
}
		
	
	
	
	
	

	


