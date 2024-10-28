package TaskAdvance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadFromProperties {
	@Test
public void login() throws IOException
{
	Properties  prop  = new Properties();
	FileInputStream Fis = new FileInputStream("/com.crm.AdvanceSeleniumM4/ConfigureFile/DwsLogin.properties");
	prop.load(Fis);
	String browser = prop.getProperty("browser");
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	System.out.println(browser);
	System.out.println(url);
	System.out.println(email);
	System.out.println(password);
	
	
	
	
}


}
