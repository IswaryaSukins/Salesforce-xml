package learning.locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SalesforceCrt extends BaseClass{

	@Test
	public void runCreate() throws InterruptedException {
		// TODO Auto-generated method stub
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    WebElement oppur = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", oppur);
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Iswarya",Keys.ENTER);
	    driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000",Keys.ENTER);
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-align_absolute-center')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
	    driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Iswarya']")).getText();
	    System.out.println(text);
	    
	    if(text.contains("Iswarya")) {
	    	System.out.println("Verified");
	    }else {
	    	System.out.println("Not Verified");
	    	
	    		
	    	}
	    }
	}


