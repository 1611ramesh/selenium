package org.basic;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1611r\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219764%7Ce%7Ccreate%20facebook%20account%7C&placement=&creative=355887219764&keyword=create%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066386563%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-302772061339%26loc_physical_ms%3D9061892%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIoJuasaSn8wIVW9VMAh0LpwXOEAAYASAAEgJsvvD_BwE");
WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));

Select select = new Select(findElement);

List<WebElement> options = select.getOptions();


for (WebElement webElement : options) {
	
	String attribute = webElement.getAttribute("value");
	
	System.out.println(attribute);
	
	
}










}
}