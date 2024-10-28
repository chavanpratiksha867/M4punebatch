package Listner;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class multipleTestCase {
	@Test(dependsOnMethods ="csk")
	public void rcb() throws InterruptedException {
		String val1 = "mani";
		String val2 ="money";
		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://www.royalchallengers.com/");
		   Thread.sleep(2000);
		   Reporter.log("rcb",true);
		   assertEquals("val1","val2");
		   driver.quit();
	}

	public void csk() throws InterruptedException {
		String val1 = "mani";
		String val2 ="money";
		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://www.chennaisuperkings.com");
		   Thread.sleep(2000);
		   Reporter.log("csk",true);
		   assertEquals("val1","val2");
		   driver.quit();
	}

}
