package Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DwsListner implements ITestListener {
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static   ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
      String name= result.getMethod().getMethodName();
        test = report.createTest(name);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		//create the extent spark reprter
				spark = new ExtentSparkReporter(".\\ExtentReport\\extentreport.html");
				//configure the configure the extent spark reporter
				spark.config().setDocumentTitle("functional testing");
				spark.config().setReportName("kavya");
				spark.config().setTheme(Theme.DARK);
				//create the extent report
				 report = new ExtentReports();
				report.setSystemInfo("os", "window-10");
				report.setSystemInfo("browser", "chrome-101");
				//attach the spark report to the extentreport
				report.attachReporter(spark);
				//create the testcase
			    
	}

	@Override
	public void onFinish(ITestContext context) {
	  report.flush();
	}
	
	

}
