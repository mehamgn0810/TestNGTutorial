package ddt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pageobjects.TestDataProviders;
import pageobjects2.HomePage2;
import pageobjects2.LoginPage2;
import utilities.Constants;
import utilities.ExcelUtility;
import utilities.ExtentFactory;

public class LoginMultipleTests {

	WebDriver driver;
	HomePage2 hp;
	LoginPage2 lp;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new ChromeDriver();
		report = ExtentFactory.getInstance();
		test = report.startTest("DDT Login Test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		hp = new HomePage2(driver, test);
		lp = new LoginPage2(driver, test);
		String sheetName = "Sheet1";
		ExcelUtility.setExcelFile(Constants.excelPath + Constants.loginDataFile, sheetName);
	}

	@Test(dataProvider = "loginData", dataProviderClass = TestDataProviders.class)
	public void loginTest(String emailId, String pwd) {
		driver.get(Constants.Url);

		hp.clickLogin();
		lp.setEmail(emailId);
		lp.setPassword(pwd);
		lp.clickLoginBtn();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		report.endTest(test);
		report.flush();
	}

}
