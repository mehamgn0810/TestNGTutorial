package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestClass1 {

	@Test
	public void test1() {
		System.out.println("\nRunning TestClass1 -> test1");
	}

	@Test
	public void test2() {
		System.out.println("\nRunning TestClass1 -> test2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nRunning TestClass1 -> BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nRunning TestClass1 -> AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nRunning TestClass1 -> BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nRunning TestClass1 -> AfterClass");
	}

}
