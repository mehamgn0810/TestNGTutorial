package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MethodsAndClassAnnotations {

	@BeforeClass
	public void beforeClass() {
		System.out.println("This runs once before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This runs once after class");
	}

	@Test
	public void test1() {
		System.out.println("Running Test1");
	}

	@Test
	public void test2() {
		System.out.println("Running Test2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This runs before every test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This runs after every test method");
	}

}
