package PageObjects;

import org.apache.commons.lang.RandomStringUtils;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.WaitHelper;

public class AccountPage {


	public WebDriver driver;
	public WaitHelper waithelper;

	public AccountPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
		waithelper=new WaitHelper(driver);

	}


	@FindBy(xpath="//a[@class='login']")
	WebElement signinLink;

	@FindBy(id="email_create")
	WebElement email;

	@FindBy(xpath="//span[normalize-space()='Create an account']")
	WebElement createAc;

	@FindBy(id="id_gender1")
	WebElement gender;

	@FindBy(id="customer_firstname")
	WebElement firstNameTxt;

	@FindBy(id="customer_lastname")
	WebElement lastNameTxt;

	@FindBy(id="email")
	WebElement emailTxt;

	@FindBy(id="passwd")
	WebElement passwordTxt;

	@FindBy(id="days")
	WebElement daysDD;

	@FindBy(id="months")
	WebElement monthDD;

	@FindBy(id="years")
	WebElement yearDD;

	@FindBy(xpath="//span[normalize-space()='Register']")
	WebElement registerBtn;


	//-------------------------------> Action Methods: <-------------------------------------------------------

	public void click_SignInLink() {

		waithelper.WaitForElement(signinLink, 10);
		signinLink.click();
		

	}

	public void enter_Email(String emailId) {

		email.sendKeys(emailId);
	}


	public void click_CreateAnAcoount() {

		waithelper.WaitForElement(createAc, 10);
		createAc.click();
		
	}

	public void select_Gender() {
		waithelper.WaitForElement(gender, 10);
		gender.click();
	}

	public void enter_FirstName(String fname) {

		waithelper.WaitForElement(firstNameTxt, 10);
		firstNameTxt.sendKeys(fname);
	}

	public void enter_LastName(String lname) {

		waithelper.WaitForElement(lastNameTxt, 10);
		lastNameTxt.sendKeys(lname);
	}


	public String getRandomEmail() {

		String number=RandomStringUtils.randomAlphabetic(5);
		String randomEmail=number+"@gmail.com";
		return randomEmail;
	}

	public void enter_Password(String pwd) {

		waithelper.WaitForElement(passwordTxt, 10);
		passwordTxt.sendKeys(pwd);
	}


	public void select_Day() {

		//waithelper.WaitForElementToBeClickable(By.id("days"), 10);
		Select selectDay=new Select(daysDD);
		selectDay.selectByValue("2");
		
		

	}

	public void select_Month() {

		//waithelper.WaitForElementToBeClickable(By.id("months"), 10);
		Select selectDay=new Select(monthDD);
		selectDay.selectByValue("1");
		

	}

	public void select_Year() {

		//waithelper.WaitForElementToBeClickable(By.id("years"), 10);
		Select selectDay=new Select(yearDD);
		selectDay.selectByValue("2021");

	}
	
	public void click_Register() {
		
		registerBtn.click();
	}

	






}
