package Basic;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.property.Child;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Dwsbaseclass.DwsbaseClass;

import comm.crm.utilityclass.Excelfile;
import comm.crm.utilityclass.propertyFile;


@Listeners
public class AssignmentOnDwsNotHardCoding extends DwsbaseClass{
	 @Test
	    public void clickLinksAndCreateAccount() throws InterruptedException, EncryptedDocumentException, Exception {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			String rss=propertyFile.property("rss");
			String fb=propertyFile.property("fb");
			String fb2=propertyFile.property("fb2");
		
				     	//String fb2="https://www.facebook.com/reg/?next=%2FnopCommerce";

			
			List<WebElement> follow_us_links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			for (WebElement follow_us : follow_us_links) {
				Thread.sleep(2000);
				follow_us.click();
				Thread.sleep(2000);
				String rss_expected=driver.getCurrentUrl();
				if(rss_expected.equals(rss))
				{
					driver.navigate().back();
					Thread.sleep(2000);
				}
			}
			Set<String> childs = driver.getWindowHandles();		
			
			
			for (String child : childs) 
			{
				driver.switchTo().window(child);
				String fb_expected=driver.getCurrentUrl();
				if(fb_expected.equals(fb))
				{
					String fb_expected1 =driver.getCurrentUrl();
					if(fb_expected1.equals(fb))
					{
						Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
						
				Set<String> fb_childs = driver.getWindowHandles();
				for (String fb_child : fb_childs) 
				{		Thread.sleep(2000);				
							String FirstName=Excelfile.excel("Sheet1", 0, 1);
							String Surname=Excelfile.excel("Sheet1", 1, 1);
							String email=Excelfile.excel("Sheet1", 2, 1);
							String pass=Excelfile.excel("Sheet1", 3, 1);
							
							driver.switchTo().window(fb_child);
							Thread.sleep(2000);
							String fb_child_expected=driver.getCurrentUrl();
							Thread.sleep(2000);
				}
				if(fb_childs.equals(fb2)){
					//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
					//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Surname);
					//driver.findElement(By.xpath("//input[@id='sex']")).click();
					//driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
					//driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(pass);
					
					//select dob
                        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	                    Select sel=new Select(day);
	                         sel.selectByValue("16");
					
                     WebElement date = driver.findElement(By.xpath("//select[@name='birthday_month']"));
                           Select sel1=new Select(date);
                           sel1.selectByValue("9");
					
                     WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	                      Select sel2=new Select(year);
                    	sel2.selectByValue("1998");
	                      Thread.sleep(2000);}
			   }
        }
	}
}


 }