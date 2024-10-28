package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleData {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.out.println("ReadMultipleData---");
		
		FileInputStream fis =new FileInputStream("D:\\Selenium\\login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		
	   int	row = sheet.getPhysicalNumberOfRows();
	    int  column= sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				String data = sheet.getRow(i) .getCell(j) .toString();
				
				System.out.println(data);
	             Thread.sleep(1500);
			}
		}
	}

}
