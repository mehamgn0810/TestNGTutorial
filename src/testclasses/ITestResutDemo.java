package testclasses;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResutDemo {
	
	@Test
	public void test1() {
		System.out.println("Running Test1");
		Assert.assertTrue(false);
	}

	@Test
	public void test2() {
		System.out.println("Running Test2");
		Assert.assertTrue(true);
	}
	
	// here we have used @AfterMethod because ITestResult holds only details of last executed method.
	// If @AfterClass is used, ITestResult has no clue from which test to get the result
	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if(testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed: " + testResult.getMethod().getMethodName());
		}else if(testResult.isSuccess()){
			System.out.println("Success: " + testResult.getName());
		}
		
	}

}
