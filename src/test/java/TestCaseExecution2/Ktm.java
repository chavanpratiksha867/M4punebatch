package TestCaseExecution2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ktm {
	 @Test (groups = "Smoke")
	 	public void ktm() {
	 		   WebDriver driver = new ChromeDriver();
	 		   driver.manage().window().maximize();
	 		   driver.get("https://www.ktm.com/en-in.html");
	 		   driver.close();
	 }

}
