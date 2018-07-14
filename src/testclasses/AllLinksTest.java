package testclasses;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.AllLinks;

public class AllLinksTest {
	
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
	public void test(){
		driver.get(baseUrl);
		
		List<WebElement> elements = AllLinks.clickableLinkElements(driver);
		
		for (WebElement el: elements) {
			String link = el.getAttribute("href");
			try {
				URL url = new URL(link);
				System.out.println("URL " + link + " returned " + AllLinks.linkStatus(url));
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@After
	public void tearDown() throws Exception {
	}
	
}
