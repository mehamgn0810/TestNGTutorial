package exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginTest {

	private WebDriver driver;
	private HomePage hp;
	private LoginPage lp;
	private String baseUrl;

	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		baseUrl = "https://letskodeit.teachable.com/";
		hp = new HomePage(driver);
		lp = new LoginPage(driver);	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		driver.get(baseUrl);
		hp.clickLogin();
		lp.setEmail("test@example.com");
		lp.setPassword("password123");
		lp.clickLoginBtn();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
