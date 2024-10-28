package comm.crm.utilityclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excelfile {
	@Test
	public static String excel(String s,int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\base1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sheet=  wb.getSheet(s);
			String data = sheet.getRow(row).getCell(cell).toString();
	
			return data;
					
		
	}
}
