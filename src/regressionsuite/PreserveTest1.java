package regressionsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PreserveTest1 {

	@Test
	public void test1() {
		System.out.println("\nRunning preserveTest1 -> test1");
	}

	@Test
	public void test2() {
		System.out.println("\nRunning preserveTest1 -> test2");
	}

	@BeforeClass
	public void setUp() {
		System.out.println("\nRunning preserveTest1 -> BeforeClass");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("\nRunning preserveTest1 -> AfterClass");
	}

}
