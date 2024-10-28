package Listner;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import assertion.AssertEqualsMethod;
@Listeners
public class LaunchListeners {
	@Test
	public void csk() throws InterruptedException {
		String val1 = "mani";
		String val2 ="money";
		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://www.chennaisuperkings.com");
		   Thread.sleep(2000);
		   driver.quit();
		   Reporter.log("csk",true);
		   assertEquals("val1","val2");
		   driver.quit();
		
	}

	
	
	

}
