package regressionsuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import appcode.Sum;

public class DependantTest {
	
	Sum s;

	@Test(dependsOnMethods= {"test2"}, alwaysRun=true)
	public void test1() {
		System.out.println("Running Test1");
	}

	@Test
	public void test2() {
		System.out.println("Running Test2");
		int result = s.sumInt(1, 2);
		Assert.assertEquals(result, 2);
	}

	@Test(dependsOnMethods= {"test1"})
	public void test3() {
		System.out.println("Running Test3");
	}

	@Test(dependsOnMethods= {"test3"})
	public void test4() {
		System.out.println("Running Test4");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running BeforeClass");
		s = new Sum();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running AfterClass");
	}

}
