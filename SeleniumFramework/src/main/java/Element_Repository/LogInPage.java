package Element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

	public LogInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="Email")
	private WebElement emailtextBox;
	
	@FindBy(id="Password")
	private WebElement passwordTextbox;
	
	@FindBy(id="RememberMe")
	private WebElement remembermeCheckBox;
	
	
	
	
	
	@FindBy(partialLinkText="Forgot password?")
	private WebElement ForgotpasswordLink;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getEmailtextBox() {
		return emailtextBox;
	}

	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getRemembermeCheckBox() {
		return remembermeCheckBox;
	}

	public WebElement getForgotpasswordLink() {
		return ForgotpasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
