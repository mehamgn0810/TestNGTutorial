package pageobjects2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage2 {

	WebDriver driver;
	ExtentTest test;

	@FindBy(id = "user_email")
	WebElement email;

	@FindBy(id = "user_password")
	WebElement password;

	@FindBy(name = "commit")
	WebElement loginBtn;

	public LoginPage2(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String emailId) {
		email.clear();
		email.sendKeys(emailId);
		test.log(LogStatus.INFO, "Entered Email ID");
	}

	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
		test.log(LogStatus.INFO, "Entered Password");
	}

	public void clickLoginBtn() {
		loginBtn.click();
		test.log(LogStatus.INFO, "Clicked Login button");
	}

	public void login(String emailId, String pwd) {
		setEmail(emailId);
		setPassword(pwd);
		clickLoginBtn();
	}

	public boolean isLoggedIn() {
		String url = driver.getCurrentUrl();
		if (url.equals("https://learn.letskodeit.com/")) {
			return true;
		} else {
			return false;
		}
	}

}
