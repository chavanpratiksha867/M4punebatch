
package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEqualsMethod {

    @Test
    public void assertEqualsMethod() {
        String expectedResult = "https://demowebshop.tricentis.com";
        
        // open the browser
        WebDriver driver = new ChromeDriver();
        
        // maximize the browser
        driver.manage().window().maximize();
        
        // waiting condition
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        // enter into dws
        driver.get("https://demowebshop.tricentis.com");
        String actualResult = driver.getCurrentUrl();  // Moved this after driver.get()
        
        // Assert the URL is correct
        assertEquals(actualResult, expectedResult);     //("watch", Keys.ENTER);
        
        
        // Search for "watch"
       // driver.findElement(By.xpath("//input[@id='small-searchterms']").sendKeys("watch",Keys.ENTER));
        
        // Locate the search button using a correct CSS selector
        WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
        
        // Assert that the search button is enabled
        assertTrue(search.isEnabled());
        
        // Click the search button
        search.click();
    }
}
