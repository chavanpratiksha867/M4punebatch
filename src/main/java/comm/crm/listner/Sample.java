package comm.crm.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

public class Sample implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	      Reporter.log("onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 Reporter.log("onTestSucces",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 Reporter.log("onTestFailure",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		 Reporter.log("onTestSkipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		 Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		 Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		 Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		 Reporter.log("onFinish",true);
	}
	
}

 

