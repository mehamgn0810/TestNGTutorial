package expediatests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import expediapageobjects.SearchPageObject;

public class SearchForFlightsPO {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.co.in/";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		
		SearchPageObject.navigateToFlightsTab(driver);
		SearchPageObject.fillOriginTextBox(driver, "Delhi, India (DEL)");
		SearchPageObject.filldestinationTextBox(driver, "Chennai, India (MAA)");
		SearchPageObject.filldepartDateBox(driver, "01/05/2018");
		SearchPageObject.fillreturnDateBox(driver, "05/05/2018");
		SearchPageObject.clickSearchButton(driver);
	}

	@After
	public void tearDown() throws Exception {
		
	}

}
