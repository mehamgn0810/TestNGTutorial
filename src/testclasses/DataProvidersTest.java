package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;

public class DataProvidersTest {

	private WebDriver driver;
	private String baseUrl;
	private HomePage hp;
	private LoginPage lp;

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			{"test1@example.com", "pwd1"},
			{"test2@example.com", "pwd2"},
			{"test3@example.com", "pwd3"}
		};
	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "dp")
	public void test(String emailId, String pwd) {
		driver.get(baseUrl);
		hp.clickLogin();
		lp.setEmail(emailId);
		lp.setPassword(pwd);
		lp.clickLoginBtn();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
