package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestClass2 {
	
	@Test
	public void test1() {
		System.out.println("\nRunning TestClass2 -> test1");
	}

	@Test
	public void test2() {
		System.out.println("\nRunning TestClass2 -> test2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nRunning TestClass2 -> BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nRunning TestClass2 -> AfterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("\nRunning TestClass2 -> BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("\nRunning TestClass2 -> AfterClass");
	}
}
