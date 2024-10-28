package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) {
		// open the browser
		WebDriver driver = new ChromeDriver();
		//manage the browser
		driver.manage().window().maximize();
		//waiying condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	  

	}


	}


