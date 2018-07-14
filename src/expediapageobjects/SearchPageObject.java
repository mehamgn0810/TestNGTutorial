package expediapageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageObject {
	public static WebElement element = null;

	public static void navigateToFlightsTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@data-lobtab='flight']"));
		element.click();
	}

	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		return element;
	}

	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.clear();
		element.sendKeys(origin);
	}

	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}

	public static void filldestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.clear();
		element.sendKeys(destination);
	}

	public static WebElement departDateBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}

	public static void filldepartDateBox(WebDriver driver, String departDate) {
		element = departDateBox(driver);
		element.clear();
		element.sendKeys(departDate);
	}
	
	public static WebElement returntDateBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}

	public static void fillreturnDateBox(WebDriver driver, String returnDate) {
		element = returntDateBox(driver);
		element.clear();
		element.sendKeys(returnDate);
	}
	
	public static WebElement SearchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	
	public static void clickSearchButton(WebDriver driver) {
		element = SearchButton(driver);
		element.click();
	}
}
