package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// before test method starts
		System.out.println("onTestStart -> TestName: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// runs on test success
		System.out.println("onTestSuccess -> TestName: " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// runs on test failure
		System.out.println("onTestFailure -> TestName: " + result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// Runs If test method is skipped
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Ignore this. Wont use much
		
	}

	@Override
	public void onStart(ITestContext context) {
		// Before <test> tag of xml file
		System.out.println("onStart -> TestName: " + context.getName());
		ITestNGMethod[] methods = context.getAllTestMethods();
		System.out.println("The following methods will be executed in this test");
		for(ITestNGMethod method: methods) {
			System.out.println(method.getMethodName());
		}
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// After <test> tag of xml file
		System.out.println("onFinish -> TestName: " + context.getName());
		
	}

}
