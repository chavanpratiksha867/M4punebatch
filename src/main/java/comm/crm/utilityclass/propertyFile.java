package comm.crm.utilityclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertyFile {
	
	
	public static String property(String key) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/com.crm.AdvanceSeleniumM4/src/main/resources/dwslogin/DWSLogin.properties");
	    prop.load(fis);
		String data = prop.getProperty(key);
		
		return data;

	    
	}

}
