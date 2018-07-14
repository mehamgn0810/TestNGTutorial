package expediatests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import expediapageobjects.SearchPageFactory;

public class SearchForFlightsPF {
	private WebDriver driver;
	private String baseUrl;
	private SearchPageFactory searchPage;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.co.in/";
		searchPage = new SearchPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("DEL");
		searchPage.setDestinationCity("MAA");
		searchPage.setDepartingDate("01/05/2018");
		searchPage.setReturningDate("05/05/2018");
		searchPage.clickSearchButton();
	}

	@After
	public void tearDown() throws Exception {
	}

}
