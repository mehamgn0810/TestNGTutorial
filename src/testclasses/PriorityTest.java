package testclasses;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=2)
	public void test1() {
		System.out.println("Running Test1");
	}

	@Test(priority=1)
	public void test2() {
		System.out.println("Running Test2");
	}

	@Test(priority=0)
	public void test3() {
		System.out.println("Running Test3");
	}
}
