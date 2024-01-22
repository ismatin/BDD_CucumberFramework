package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath="//a[@class='login']")
	WebElement SignInLink;

	@FindBy(id="email")
	WebElement email;

	@FindBy(id="passwd")
	WebElement password;

	@FindBy(id="SubmitLogin")
	WebElement submitbtn;


	@FindBy(xpath="//span[text()='Matin shaikh']")
	WebElement profileName;


	public void click_SignInLink() {

		SignInLink.click();

	}

	public void enter_Email(String emailId) {

		email.sendKeys(emailId);
	}

	public void enter_Password(String pwd) {

		password.sendKeys(pwd);
	}
	
	public void click_Submit() {
		
		submitbtn.click();
	}

	
	public String VerifyProfileName() {
		
		String name=profileName.getText();
		return name;
	}


}
