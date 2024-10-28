package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLogin;

@Test
public class Login {

		@Test
		public void login() {
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("");
			DwsLogin ref = new DwsLogin(driver);
			WebElement email = ref.Email;
			WebElement password = ref.password;
			WebElement button = ref.login_button;
			email.sendKeys("admin01@@gmail.com");
			password.sendKeys("admin01");
			button.click();
		}
		
	
	
}

