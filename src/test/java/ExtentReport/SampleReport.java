package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	@Test
	public void sample() {
		//create the extent spark reprter
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\ExtentReport\\sampleReport.html");
		//configure the configure the extent spark reporter
		spark.config().setDocumentTitle("functional testing");
		spark.config().setReportName("kavya");
		spark.config().setTheme(Theme.DARK);
		//create the extent report
		ExtentReports report = new ExtentReports();
		report.setSystemInfo("os", "window-10");
		report.setSystemInfo("browser", "chrome-101");
		//attach the spark report to the extentreport
		report.attachReporter(spark);
		//create the testcase
		ExtentTest test = report.createTest("sample");
		report.flush();
		
		
	}

}
