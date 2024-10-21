package learning.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseClass {
	public ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
    
	ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notificatons");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://login.salesforce.com/");
    driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
    driver.findElement(By.id("password")).sendKeys("leaf@2024");
    driver.findElement(By.id("Login")).click();

}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	}

