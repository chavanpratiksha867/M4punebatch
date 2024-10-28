package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomtask.Registration;

public class Task1 {
	@Test
	public void Register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/register");
		Registration ref = new Registration(driver);
	
		WebElement register=ref.register;
		WebElement search=ref.search;
		
		WebElement gender=ref.gender;
		WebElement firstname=ref.firstname;
		WebElement lastname = ref.lastname;
		
		WebElement email=ref.email;
		WebElement password=ref.password;
		
		WebElement confirmpassword = ref.confirmpassword;
		WebElement registerbutton = ref.registerbutton;
          //register.click();                        
		search.sendKeys("books");
		search.click();
		register.click();
		gender.click();
		firstname.sendKeys("kavya");
		lastname.sendKeys("chavan");
		email.sendKeys("kavya98@gmail.com");
		password.sendKeys("kavya@98");
		confirmpassword.sendKeys("kavya@98");
		registerbutton.click();
		
	}

}
