package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	
	public static void main() throws EncryptedDocumentException, IOException, InterruptedException {
		System.out.println("ReadMultipleData---");
	
		FileInputStream fis =new FileInputStream("D:\\Selenium\\login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				String data = sheet.getRow(i) .getCell(j) .toString();
				
				System.out.println(data);
	             Thread.sleep(1500);
			  }
		   }
		
		
		}
}

