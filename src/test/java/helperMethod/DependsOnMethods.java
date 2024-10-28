package helperMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {
	  @Test (dependsOnMethods =" rcb" )
	  //it will on hold once 
	   public void csk() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.chennaisuperkings.com/");
		   driver.close();
		   
		   
	   }
	   @Test 
	   public void canva() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.canva.com/en_in/download/windows/");
		   driver.close();
	   }
	   @Test
	   public void rcb() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.royalchallengers.com/");
		   driver.close();
	   }

}

