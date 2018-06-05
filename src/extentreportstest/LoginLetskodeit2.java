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
import pageobjects2.HomePage2;
import pageobjects2.LoginPage2;
import utilities.ExtentFactory;

// LoginLetskodeit With more features
public class LoginLetskodeit2 {

	private WebDriver driver;
	private HomePage2 hp;
	private LoginPage2 lp;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void setUp() {
		baseUrl = "https://letskodeit.teachable.com/";
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Login Test");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started.....");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Window maximized");
		hp = new HomePage2(driver, test);
		lp = new LoginPage2(driver, test);		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Application Opened");
		
		hp.clickLogin();
//		lp.setEmail("test@email.com");
//		lp.setPassword("abcabc");
//		lp.clickLoginBtn();
		lp.login("test@email.com", "abcabc");
		
		boolean loggedIn = lp.isLoggedIn();
		Assert.assertTrue(loggedIn);
		test.log(LogStatus.PASS, "Login Successful");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		report.endTest(test);
		report.flush();
	}

}
