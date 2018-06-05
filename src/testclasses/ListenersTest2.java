package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.CustomListener2;

@Listeners(CustomListener2.class)
public class ListenersTest2 {
	@BeforeClass
	public void setUp() {
		System.out.println("Code from beforeClass");
	}

	@Test
	public void test1() {
		System.out.println("Code from test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("Code from test2");
		Assert.assertTrue(false);
	}

	@AfterClass
	public void testDown() {
		System.out.println("Code from afterClass");
	}
}
