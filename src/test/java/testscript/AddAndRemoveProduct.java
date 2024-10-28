package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import com.crm.Dwsbaseclass.DwsbaseClass;
public class AddAndRemoveProduct extends DwsbaseClass {
	@Test
    public void addAndRemoveProducts() {
        // Click on Digital Downloads
        driver.findElement(By.linkText("Digital downloads")).click();
        
        // Add all products to the cart
        List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
        for (WebElement product : products) {
            product.click(); // Add each product to the cart
        }

        // Navigate to the shopping cart
        driver.findElement(By.linkText("Shopping cart")).click();
        
        // Wait for the shopping cart page to load (adjust timeout as necessary)
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='updatecart']")));

        // Find all remove checkboxes (assumes there are checkboxes to select products for removal)
        List<WebElement> removeCheckboxes = driver.findElements(By.xpath("//input[@name='removefromcart']"));
        for (WebElement checkbox : removeCheckboxes) {
            checkbox.click(); // Select the checkbox to remove the product
        }

        // Click the 'Update cart' button to finalize the removal
        driver.findElement(By.xpath("//input[@name='updatecart']")).click();
    
        //  to check if the cart is now empty
        WebElement emptyCartMessage = driver.findElement(By.xpath("//div[@class='order-summary-content']"));
        String message = emptyCartMessage.getText();
        
    
        }
    }

