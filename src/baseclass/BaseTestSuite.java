package baseclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nRunning BaseTestSuite -> BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nRunning BaseTestSuite -> AfterClass");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("\nRunning BaseTestSuite -> BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("\nRunning BaseTestSuite -> AfterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("\nRunning BaseTestSuite -> BeforeTest");	
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("\nRunning BaseTestSuite -> AfterTest");	
	}
}
