package TaskAdvance;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test;


@Test
public class CrossBrowser {
     public void search() throws IOException {
    	 //read data from excel
    	 FileInputStream Fis = new FileInputStream("D:\\Selenium\\Login.xlsx");
    	 Workbook wb = WorkbookFactory.create(Fis);
    		Sheet sheet = wb.getSheet("Sheet3");
    		String data = sheet.getRow(0) .getCell(0) .toString();
    		System.out.println(data);
    		
    	 //read date (common) from properties file
         Properties  prop  = new Properties();
 		FileInputStream Fis1 = new FileInputStream("../com.crm.AdvanceSeleniumM4/ConfigureFile/DwsLogin.properties");
 		prop.load(Fis1);
 		String browser = prop.getProperty("browser");
 		String url = prop.getProperty("url");
 		String email = prop.getProperty("email");
 		String password = prop.getProperty("password");
 		System.out.println(email);
 		System.out.println(password);
    	 
	   //open the browser
	    WebDriver driver = new ChromeDriver();
	    // Maximize window and set waiting time
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to the DWS page
        driver.get(url);

        // Search using data from Excel
        driver.findElement(By.id("small-searchterms")).sendKeys(data);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
         driver.navigate().back();
        // Login process
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
        
        }
       
     }

	 