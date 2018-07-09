package utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String path = "C:\\Users\\MEHAVARNAN\\Documents\\eclipse-workspace\\TestNGTutorial\\extentreports\\DDT-report.html";
		extent = new ExtentReports(path, false);
		extent.addSystemInfo("Selenium Version", "3.11");
		extent.addSystemInfo("Platform", "Windows10");
		
		return extent;
	}

}
