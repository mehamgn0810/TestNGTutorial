package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {
	
	//IInvokedMethodListener is an Interface. Hence all methods needs to be implemented

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// Executes Before every method in the Test Class
		System.out.println("Running beforeInvocation: " + testResult.getTestClass().getName() + "=>"
				+ method.getTestMethod().getMethodName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// Executes After every method in the Test Class
				System.out.println("Running afterInvocation: " + testResult.getTestClass().getName() + "=>"
						+ method.getTestMethod().getMethodName());
	}

}
