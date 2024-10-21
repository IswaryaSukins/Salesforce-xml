package learning.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesforceGroup extends BaseClass{
@Test
	public void runGroup() {
		// TODO Auto-generated method stub
		
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    
	    Actions drop=new Actions(driver);
	    WebElement groupId = driver.findElement(By.xpath("//p[text()='Work Type Groups']"));
	    drop.moveToElement(groupId).click().perform();
	    
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Iswarya",Keys.ENTER);
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    
	    String text = driver.findElement(By.xpath("(//lightning-formatted-text[@slot='primaryField'])[2]")).getText();
	    System.out.println(text);
	    
	    if(text.contains("Iswarya")) {
	    	System.out.println("verified");
	    }else {
	    	System.out.println("Not Verified");
	    	
	    
	    }
	}

}
