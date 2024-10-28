package TaskAdvance;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

@Test
public class Task {
	public void Search() throws IOException {
		
		Properties  prop  = new Properties();
		//we can only give filename with single dot
		FileInputStream Fis = new FileInputStream(".ConfigureFile/DwsLogin.properties");
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
