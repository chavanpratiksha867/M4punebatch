package helperMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {

	   @Test (priority = 1,invocationCount = 4 , threadPoolSize  = 2)
	   public void csk() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.chennaisuperkings.com/");
		   driver.close();
		   
		   
	   }
	   @Test(priority = 2, enabled = true)
	   public void canva() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("");
		   driver.close();
	   }
	   @Test(priority = 3 , enabled = false)
	   public void rcb() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("    ");
		   driver.close();
	   }
	

}
