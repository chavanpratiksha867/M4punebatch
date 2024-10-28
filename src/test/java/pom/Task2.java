package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomtask.LoginPage;


public class Task2 {
	@Test
	public void Register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		 LoginPage ref = new  LoginPage(driver);
		WebElement email=ref.email;
		WebElement password = ref.password;
		WebElement rememberme = ref.remember;
		WebElement loginbutton = ref.loginbutton;
		
		email.sendKeys("kavya98@gmail.com");
		password.sendKeys("kavya@98");
		rememberme.click();
		loginbutton.click();
	}

}
