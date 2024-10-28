package ExtentReportBasic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.Dwsbaseclass.DwsBase;

public class Testing4 extends DwsBase{
	@Test
	public void main4() {
		Assert.assertEquals("bug","big");
		Reporter.log("i am the main4");
	}

}
