package extentreportstest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginLetskodeit {

	private WebDriver driver;
	private HomePage hp;
	private LoginPage lp;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void setUp() {
		baseUrl = "https://letskodeit.teachable.com/";
		report = new ExtentReports(
				"C:\\Users\\MEHAVARNAN\\Documents\\eclipse-workspace\\TestNGTutorial\\extentreports\\login.html");
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
		lp.setEmail("test@email.com");
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

	@AfterMethod
	public void tearDown() {
		driver.close();
		report.endTest(test);
		report.flush();
	}

}
