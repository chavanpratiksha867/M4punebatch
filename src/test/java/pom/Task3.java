package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomtask.DwsHomePage;
import pomtask.Registration;

public class Task3 {
	@Test
	public void homePage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		DwsHomePage ref = new DwsHomePage(driver);
	   WebElement register = ref.register_link;
	   register.click();
	   Thread.sleep(2000);
	   
	      WebElement logo = ref.logo;
	      logo.click();
	      Thread.sleep(2000);
	      
	      WebElement excellent = ref.excellent_radio_btn;
	      excellent.click();
	      Thread.sleep(2000);
	     
	      driver.close();
		
		
		
	}
	
	
	
}
