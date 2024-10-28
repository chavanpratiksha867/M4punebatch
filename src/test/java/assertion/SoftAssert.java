package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SoftAssert {
     @Test
     public void main() {
	String expectedResult = "https://demowebshop.tricentis.com";
	//open the browser
    	WebDriver driver = new ChromeDriver();
    	//maximize the browser
    	driver.manage().window().maximize();
    	//waiting condition
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	String actualResult = driver.getCurrentUrl();
    	//enter into dws
    	driver.get("https://demowebshop.tricentis.com");
    	org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
    	soft.assertEquals(expectedResult, actualResult);
    	assertEquals(actualResult,expectedResult);
    	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("watch",Keys.ENTER);
    	WebElement search = driver.findElement(By.cssSelector("input[type='submit]"));
    	soft.assertTrue(search.isEnabled());
    	search.click();    		
    	soft.assertAll();
    	 }	
    	
   }
	



