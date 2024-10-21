package learning.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SalesforceEntity extends BaseClass {
@Test
	public void runEntity() {
		// TODO Auto-generated method stub
		
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	    
	    WebElement dd=driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", dd);
		
		WebElement legal=driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[14]"));
		executor.executeScript("arguments[0].click();", legal);
		
		WebElement legal1=driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		executor.executeScript("arguments[0].click();", legal1);
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Iswarya");
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String text1=driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		
		if(text1.contains("Salesforce Automation by Iswarya"))
		{			
			System.out.println("verified successfully");
		
				}
else
		{			
			System.out.println("Not Found");
				}

	}

}
