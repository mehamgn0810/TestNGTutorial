package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowsAuthentication {
	WebDriver driver;
	String baseUrl;

	@BeforeClass
	public void beforeClass() {
		//baseUrl = "http://engprod-charter.net/";
		baseUrl = "http://rsyspedia.india.rsystems.com";
		driver = new FirefoxDriver();
	}

	@Test
	public void handleAuthentication() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec(
				"C:\\Users\\MEHAVARNAN\\Documents\\eclipse-workspace\\OrangeHRM\\AutoIt\\WindowsAuthentication.exe");
		driver.get(baseUrl);
	}

	@AfterClass
	public void afterClass() {
	}

}
