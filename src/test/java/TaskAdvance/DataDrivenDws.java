package TaskAdvance;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenDws {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    String ExpectedResult = "https://demowebshop.tricentis.com";
	    FileInputStream fis  = new FileInputStream("D:\\Selenium\\login.xlsx");
	      Workbook  wb = WorkbookFactory.create(fis);
	     Sheet sheet = wb.getSheet("Sheet2");
	     String email= sheet.getRow(0).getCell(0).toString();
	     String pwd = sheet.getRow(0).getCell(1).toString();
	     System.out.println(email);
	     System.out.println(pwd);
	      // open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into dws
		driver.get("https://demowebshop.tricentis.com");
		 String actualResult= driver.getCurrentUrl();
		 if(ExpectedResult.equals(actualResult)) {
			 System.out.println("i am in dws");
			WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
			if(login.isEnabled()) {
				 System.out.println("login is enable");
				 driver.findElement(By.xpath("//a[@class='ico-login']")).click();
				 driver.findElement(By.id("Email")).sendKeys(email);
				 driver.findElement(By.id("Password")).sendKeys(pwd);
				 driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
				 
				 
			}
			else {
				 System.out.println("not in dws page");
			}
			 
		 }
		
		
		
		
		
	}

}
