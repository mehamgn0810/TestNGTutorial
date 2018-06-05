package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.Assert;
import org.testng.Reporter;

public class ReporterAndLogs {
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("This is from BeforeClass", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("This is from beforeMethod", true);
	}

	@Test
	public void test1() {
		Reporter.log("This is from test1", true);
	}

	@Test
	public void test2() {
		Reporter.log("This is from test2", true);
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods= {"test2"})
	public void test3() {
		Reporter.log("This is from test3", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("This is from afterMethod", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("This is from afterClass", true);
	}

}
