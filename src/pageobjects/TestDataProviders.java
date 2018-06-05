package pageobjects;

import org.testng.annotations.DataProvider;

import utilities.ExcelUtility;

public class TestDataProviders {

	@DataProvider(name = "inputs")
	public Object[][] dp() {
		return new Object[][] { { "test1@example.com", "pwd1" }, { "test2@example.com", "pwd2" },
				{ "test3@example.com", "pwd3" } };
	}

	@DataProvider(name = "loginData")
	public Object[][] dp2() {
		Object[][] testData = ExcelUtility.getTestData("Invalid_Login");
		return testData;
	}

}
