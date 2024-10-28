package TestCaseExecution1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Csk {
        @Parameters("url") 
	    @Test //(groups  = "Regression")
		 public void csk(String url) {
			   WebDriver driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			   driver.get(url);
			   driver.close();

	}

}
