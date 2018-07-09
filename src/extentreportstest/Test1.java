package extentreportstest;

import java.util.concurrent.TimeUnit;
import utilities.ExtentFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import utilities.Screenshots;

public class Test1 {

	private WebDriver driver;
	private HomePage hp;
	private LoginPage lp;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void setUp() {
		baseUrl = "https://letskodeit.teachable.com/";
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Login");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started.....");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Window maximized");
		hp = new HomePage(driver);
		lp = new LoginPage(driver);		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Application Opened");
		hp.clickLogin();
		test.log(LogStatus.INFO, "Clicked Login link in HomePage");
		lp.setEmail("test111@email.com");
		test.log(LogStatus.INFO, "Entered Email ID");
		lp.setPassword("abcabc");
		test.log(LogStatus.INFO, "Entered Password");
		lp.clickLoginBtn();
		test.log(LogStatus.INFO, "Clicked Login Button");
		
		String expected = "https://learn.letskodeit.com/";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		test.log(LogStatus.PASS, "Login Successful");
	}
	
	// here we have used @AfterMethod because ITestResult holds only details of last executed method.
	// If @AfterClass is used, ITestResult has no clue from which test to get the result
	@AfterMethod
	public void tearDown(ITestResult testResult) throws Exception {
		if(testResult.getStatus()==ITestResult.FAILURE) {
			String path = Screenshots.takeScreenshot(driver, testResult.getName());
			String imgPath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Login Test Failed", imgPath);
		}
		driver.close();
		report.endTest(test);
		report.flush();
	}

}
