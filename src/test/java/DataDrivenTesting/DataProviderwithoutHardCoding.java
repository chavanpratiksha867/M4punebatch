package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderwithoutHardCoding {
	@Test(dataProvider ="login")
	 public void SendData(String email,String Password){
	    	//open the browser
	    	WebDriver driver = new ChromeDriver();
	    	//maximize the browser
	    	driver.manage().window().maximize();
	    	//waiting condition
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    	//enter into dws
	    	driver.get("https://demowebshop.tricentis.com");
	    
	    		driver.findElement(By.className("ico-login")).click();
	    		driver.findElement(By.id("Email")).sendKeys(email);
	    		driver.findElement(By.id("Password")).sendKeys(Password);
	    		driver.findElement(By.id("RememberMe")).click();
	    		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	    		driver.findElement(By.xpath("(//input[@ type='button'] )[4]")).click();   		
	    		
	    		driver.close();
	    }
	    		@DataProvider(name = "login")
	    	   public Object[][] provide() throws IOException
	    	   {
	    			FileInputStream Fis =  new FileInputStream("D:\\Selenium\\login.xlsx");
	    			Workbook wb=WorkbookFactory.create(Fis);
	    			 org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Sheet4");
	    			int row = sheet.getPhysicalNumberOfRows();
	    			int column = sheet.getRow(0).getPhysicalNumberOfCells();
	    		     
	    			Object[][] obj=new Object[row][column];
	    				
	    			for(int i = 0; i < row; i++){
	    				for(int j= 0; j < column; j++) {
	    					if (sheet.getRow(i).getCell(j) != null) {
	    	                    obj[i][j] = sheet.getRow(i).getCell(j).toString(); // Read the cell value
	    	                } else {
	    	                    obj[i][j] = ""; // Assign empty string if cell is null
	    	                }
	    	            }
	    	        }
	    					//obj[i][j]=sheet.getRow(i).getCell(j).toString();
	    				//  }
	    				//}
	    		   return obj;
	    	  
	    	   }
		}
	    		
	    	
	    	
	    



	
	
	
	
	
	


