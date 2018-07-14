package expediapageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//ul[@class='tabs cf col']//li[1]")
	WebElement flightsTab;
	
	@FindBy(id="flight-origin")
	WebElement originTextBox;
	
	@FindBy(id="flight-destination")
	WebElement destinationTextBox;
	
	@FindBy(id="flight-departing")
	WebElement departDateBox;

	@FindBy(id="flight-returning")
	WebElement returntDateBox;
	
	@FindBy(xpath="//button[@id='search-button']")
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		flightsTab.click();
	}
	
	public void setOriginCity(String origin) {
		originTextBox.clear();
		originTextBox.sendKeys(origin);
	}

	public void setDestinationCity(String destination) {
		destinationTextBox.clear();
		destinationTextBox.sendKeys(destination);
	}
	
	public void setDepartingDate(String departingDate) {
		departDateBox.clear();
		departDateBox.sendKeys(departingDate);
	}
	
	public void setReturningDate(String returningDate) {
		returntDateBox.clear();
		returntDateBox.sendKeys(returningDate);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
}
