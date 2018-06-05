package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.TestDataProviders;

//Extending a test class with data provider class also works

public class DataProvidersTest2 {
	private WebDriver driver;
	private String baseUrl;
	private HomePage hp;
	private LoginPage lp;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(dataProvider = "inputs", dataProviderClass = TestDataProviders.class)
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
