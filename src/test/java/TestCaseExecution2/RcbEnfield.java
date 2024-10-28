package TestCaseExecution2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RcbEnfield {

     @Test(groups =  "Smoke")
 	public void enfield() {
 		   WebDriver driver = new ChromeDriver();
 		   driver.manage().window().maximize();
 		   driver.get("https://rcb.com/brand/royal-enfield/");
 		   driver.close();

      }
     
}
