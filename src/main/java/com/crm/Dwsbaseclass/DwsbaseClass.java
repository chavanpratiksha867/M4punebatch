package com.crm.Dwsbaseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import comm.crm.utilityclass.propertyFile;

public class DwsbaseClass {
    
    public static WebDriver driver;
    public static WebDriver driver2;
  

    @BeforeClass
    public static void preCondition() throws IOException, InterruptedException {
    	String browser=propertyFile.property("browser");
		String url=propertyFile.property("url");
		
		if(browser.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("safari")){
			driver=new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("InternetExplorer")){
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else{
			driver=new ChromeDriver();
		}
        driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(url);
		 WebDriver driver2 = driver;

    }
       

       
    @BeforeMethod
    public void login() throws IOException {
        // Get login credentials from properties file
        String email = propertyFile.property("email");
        String password = propertyFile.property("password");

        // Perform login actions
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
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
