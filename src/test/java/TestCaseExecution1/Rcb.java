package TestCaseExecution1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rcb {
	 @Parameters("url") 
	 @Test

	public void Rcb(String url) {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(url);
		   driver.close();
	}

}
