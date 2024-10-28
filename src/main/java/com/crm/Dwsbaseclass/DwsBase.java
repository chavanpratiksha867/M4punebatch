package com.crm.Dwsbaseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBase {
   public static WebDriver driver;
   public static WebDriver driver2;
        
	@BeforeClass
    public void preCondition() {
    	//open the browser
		 driver = new ChromeDriver();
		//manage the browser
		driver.manage().window().maximize();
		//waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into page
	   driver.get("https://demowebshop.tricentis.com");
	   driver2 = driver;
		 }
	@BeforeMethod
	public void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.className("ico-logout")).click();
	}
	@AfterClass
	public void postCondition() {
		driver.quit();
	}
	
}
