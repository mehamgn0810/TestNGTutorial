package regressionsuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GroupingTest {

	@Test(groups = { "cars", "suv" })
	public void test_BMW() {
		System.out.println("Running -> BMW X6");
	}

	@Test(groups = { "cars", "sedan" })
	public void test_Audi() {
		System.out.println("Running -> Audi A6");
	}

	@Test(groups = { "bikes" })
	public void test_Kawasaki() {
		System.out.println("Running -> Kawasaki Ninja");
	}

	@Test(groups = { "bikes" })
	public void test_Honda() {
		System.out.println("Running -> Honda CBR");
	}

	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("Running -> BeforeClass");
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("Running -> AfterClass");
	}

}
