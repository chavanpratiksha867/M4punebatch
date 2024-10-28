package ExtentReportBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.Dwsbaseclass.DwsBase;

public class Testing1 extends DwsBase {
	@Test
	public void main1() {
		Reporter.log("i am the main1");
	}

}
