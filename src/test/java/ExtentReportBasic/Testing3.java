package ExtentReportBasic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.Dwsbaseclass.DwsBase;

public class Testing3 extends DwsBase{
	@Test
	public void main3() {
		Assert.assertEquals("throne", "thrane");
		Reporter.log("i am the main3");
	}

}
