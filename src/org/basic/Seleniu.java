package org.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniu {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	driver.manage().window().maximize();
WebElement findElement = driver.findElement(By.tagName("table"));
WebElement findElement2 = findElement.findElement(By.tagName("thead"));
List<WebElement> findElements3 = findElement2.findElements(By.tagName("th"));
for (int k = 0; k < findElements3.size() ; k++) {
	if (k%2==0) {
		WebElement webElement = findElements3.get(k);
		String text = webElement.getText();
		System.out.print(text+"\t");
	}}
System.out.println("\n");
WebElement findElement3 = findElement.findElement(By.tagName("tbody"));

List<WebElement> findElements2 = findElement3.findElements(By.tagName("td"));
	for (int j = 0; j <findElements2.size(); j++ ){
			if (j%2==0) {
				WebElement webElement2 = findElements2.get(j);
				String text = webElement2.getText();
				System.out.print(text+"\t");
				if (j==2) {
					System.out.println("\n");
				}
					if (j==6) {
						System.out.println("\n");
					}
					if (j==10) {
						System.out.println("\n");
					}
					if (j==14) {
						System.out.println("\n");
					}
					if (j==18) {
						System.out.println("\n");
					}
					if (j==22) {
						System.out.println("\n");
					}
					
					
					
					
					
				}
				}
			
			}	}

		
		
		
		
	
	
	

	
	

		
	
	



	

		
	
