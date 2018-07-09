package pageobjects2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage2 {
	
	WebDriver driver;
	ExtentTest test;
	
	@FindBy(linkText="Login")
	WebElement loginLink;
	
	public HomePage2(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() {
		loginLink.click();
		test.log(LogStatus.INFO, "Clicked Login link in HomePage");
	}

}
