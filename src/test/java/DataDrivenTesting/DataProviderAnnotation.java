package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	 @Test(dataProvider ="login")

	 public void SendData(String email, String Password) throws InterruptedException {

	 //open the browser
		 WebDriver driver = new ChromeDriver();
	    	//maximize the browser
	    	driver.manage().window().maximize();
	    	//waiting condition
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    	//enter into dws
	    	driver.get("https://demowebshop.tricentis.com");
	    
	    		driver.findElement(By.className("ico-login")).click();
	    		driver.findElement(By.id("Email")).sendKeys(email);
	    		driver.findElement(By.id("Password")).sendKeys(Password);
	    		driver.findElement(By.id("RememberMe")).click();
	    		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	    		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
	    		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	    		Thread.sleep(2000);
	    		driver.close();
	    	
	    }
	      @DataProvider(name = "login")
	      public Object [][] provider(){
		    Object [][]obj = new Object[2][2];
		    obj[0][0] = "admin01@gmail.com";
		    obj[0][1] = "admin01";
		    obj[1][0] = "admin02@gmail.com";
		    obj[1][1] = "Admin02";
		   return obj;
	 }
		 
		 
		 
	 }

		 
		 
