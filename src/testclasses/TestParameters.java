package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//only String type can be passed as parameter from XML. Need to cast to int using java if needed.

public class TestParameters {
	
	@BeforeClass
	@Parameters({"browser", "platform"})
	public void setUp(String browser, String platform) {
		System.out.println("Running -> BeforeClass");
		System.out.println("Platform from XML: " + platform);
		System.out.println("Browser from XML: " + browser);
	}
	
	@Test
	@Parameters({"response"})
	public void test(String response) {
		System.out.println("Running -> test");
		String[] strArray = response.split(",");
		System.out.println("response from XML: " + response);
		System.out.println("strArray[0] from XML: " + strArray[0]);
		System.out.println("strArray[1] from XML: " + strArray[1]);
	}



}
