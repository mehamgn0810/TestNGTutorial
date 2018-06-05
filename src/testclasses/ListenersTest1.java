package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.CustomListener1;

@Listeners(CustomListener1.class)
public class ListenersTest1 {
	@BeforeClass
	public void setUp() {
		System.out.println("Code from beforeClass");
	}

	@Test
	public void test1() {
		System.out.println("Code from test1");
	}

	@Test
	public void test2() {
		System.out.println("Code from test2");
	}

	@AfterClass
	public void testDown() {
		System.out.println("Code from afterClass");
	}
}
