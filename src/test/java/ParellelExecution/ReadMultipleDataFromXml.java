package ParellelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadMultipleDataFromXml {

   // @Parameters({"url", "login", "password"})
    @Test
    public void login(String url,String login,String password) {
        String expectedResult = "https://demowebshop.tricentis.com";
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
       
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the URL
            driver.get(url);
            String actualResult = driver.getCurrentUrl();

            // Log the actual and expected results for debugging
            System.out.println("Expected URL: " + expectedResult);
            System.out.println("Actual URL: " + actualResult);

            // Verify if the correct URL is loaded
            if (expectedResult.equals(actualResult)) {
                System.out.println("i am in dws page");

                // Login process
                driver.findElement(By.className("ico-login")).click();
                driver.findElement(By.id("Email")).sendKeys(login);
                driver.findElement(By.id("Password")).sendKeys(password);
                driver.findElement(By.id("RememberMe")).click();
                driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
            } else {
                System.out.println("i am not in dws page");
            }

        } 
         
        
    }


