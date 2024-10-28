package testscript;


	
import java.time.Duration;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;


import com.crm.Dwsbaseclass.DwsbaseClass;

	public class ClickAlltheLinks extends DwsbaseClass
	{
		String expected_rss_url="https://demowebshop.tricentis.com/news/rss/1";

		@Test
		public void testScript1() throws InterruptedException
		{
			System.out.println("Test script 1");
			String rss = "https://demowebshop.tricentis.com/news/rss/1";
			String facebook = "https://www.facebook.com/nopCommerce";
			String expected = "Demo Web Shop";
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			if(expected.equals(driver.getTitle())) {
				System.out.println("I am in dws page");
				String parent = driver.getWindowHandle();
				//System.out.println(parent);
			
				List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
				for (WebElement web : links)
				{
					Thread.sleep(1000);
					web.click();
					String actual = driver.getCurrentUrl();
					Thread.sleep(2000);
					if(rss.equals(actual)) 
					{
						driver.navigate().back();
					}
		}
				
				Set<String> childs = driver.getWindowHandles();
				//System.out.println(childs);
				for (String str : childs)
				{
					Thread.sleep(2000);
					driver.switchTo().window(str);
					String actl_url1 = driver.getCurrentUrl();
					if(facebook.equals(actl_url1)) 
					{
						Thread.sleep(2000);
						driver.findElement(By.xpath("//span[text()='Create new account']")).click();
						Thread.sleep(2000);
					}
					
				}
						 driver.switchTo().window(parent); 
						
			}			
						  
		}
		
		@Test
		public void testScript2() throws InterruptedException
		{
			System.out.println("Test script 2");
			//click on digital downloads
					driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
				
					//find all add to card
					List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
					for (WebElement product : products) 
					{
						
						product.click();
						Thread.sleep(1000);
					}
					System.out.println("All Products has been added successfully...");
					
					//click on shopping card to check added products
					
					driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
					//check all products to remove 
					List<WebElement> remove_products = driver.findElements(By.xpath("//td[@class='remove-from-cart']"));
					for (WebElement remove_product: remove_products) {
						remove_product.click();
					}
					
					System.out.println("All prods are selected to remove");
					
					//click on update shopping cart
					driver.findElement(By.xpath("//input[@name='updatecart']")).click();
					System.out.println("All products succssfully remove from card");
					
					WebElement prod_empty = driver.findElement(By.xpath("//div[contains(text(),'Your Shopping Cart is empty')]"));
					if(prod_empty.isDisplayed())
					{
						//System.out.println(prod_empty.getText());
						System.out.println("Your Shopping Cart is empty...verified!!");
					}
					Thread.sleep(1500);
		}
		
}