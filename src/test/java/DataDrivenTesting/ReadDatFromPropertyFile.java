package DataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import comm.crm.utilityclass.propertyFile;

public class ReadDatFromPropertyFile  {
    @Test
	public void login() throws IOException {
    	String url = propertyFile.property("url");
    	String email = propertyFile.property("email");
    	String password = propertyFile.property("password");
    	//open the  browser
    	WebDriver driver = new ChromeDriver ();
    	//maximize
    	driver.manage().window().maximize();
    	//waiting condition
    	
    	driver.get(url);
		
    	   driver.findElement(By.className("ico-login")).click();
           driver.findElement(By.id("Email")).sendKeys(email);
           driver.findElement(By.id("Password")).sendKeys(password);
           driver.findElement(By.id("RememberMe")).click();
           driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}

}
