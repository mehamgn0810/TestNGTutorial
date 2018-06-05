package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "user_email")
	WebElement email;

	@FindBy(id = "user_password")
	WebElement password;

	@FindBy(name = "commit")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}

	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}

}
