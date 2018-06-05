package regressionsuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DisableAndTimeoutTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running -> BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running -> AfterClass");
	}

	@Test(enabled=true)
	public void test1() {
		System.out.println("Running -> Test1");
	}

	@Test(enabled=false)
	public void test2() {
		System.out.println("Running -> Test2");
	}

	@Test(timeOut=300)
	public void test3() throws InterruptedException {
		System.out.println("Running -> Test3");
		Thread.sleep(200);
	}

}
