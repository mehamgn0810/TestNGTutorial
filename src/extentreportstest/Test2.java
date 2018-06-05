package extentreportstest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtentFactory;

public class Test2 {
	
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		report = ExtentFactory.getInstance();
		test = report.startTest("Test2");
		test.log(LogStatus.INFO, "Browser Opened...");
	}

	@Test
	public void test() {
		test.log(LogStatus.INFO, "Test2 -> Method started");
		test.log(LogStatus.INFO, "Test2 -> Method continue");
		test.log(LogStatus.INFO, "Test2 -> Method ended");
	}

	@AfterClass
	public void afterClass() {
			report.endTest(test);
			report.flush();
	}

}
