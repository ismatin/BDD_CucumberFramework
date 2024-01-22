package StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import BaseClassTest.BaseClass;
import PageObjects.AccountPage;
import PageObjects.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.* ;

public class StepDefinitions extends BaseClass{


	public WebDriver driver;
	public LoginPage loginpage;
	public AccountPage accountpage;
	public Properties prop;


	@Before
	public void setup() throws IOException {

		// Logger setup
		logger=LogManager.getLogger("CucumberFramework_Practice");

		// Config.properties file setup
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//config.properties");
		prop=new Properties();
		prop.load(file);

		String browserName=prop.getProperty("browser");

		if(browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+prop.getProperty("chromepath"));
			driver=new ChromeDriver();

		}
		else if(browserName.contains("edge")) {

			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+prop.getProperty("edgepath"));
			driver=new EdgeDriver();

		}
		else {

			logger.info("Browser is not available");

		}



	}


	//*********************************** Login.feature Step Definition*****************************************************

	@Given("User Launches chrome browser")
	public void user_Launches_chrome_browser() {


		// Creating object of LoginPage
		loginpage=new LoginPage(driver);


	}

	@When("User Opens an application as {string}")
	public void user_Opens_an_application_as(String url) {
		logger.info("------------------>Login Scenario Test Case Execution:<-----------------------");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);
		logger.info("*************Opening URL of the application********************");

	}

	@When("User Clicks on Sign In link")
	public void user_Clicks_on_Sign_In_link() throws InterruptedException {

		loginpage.click_SignInLink();
		logger.info("*************Clicking on Sign In Link********************");
		

	}

	@When("User Enters a valid email address {string}")
	public void user_Enters_a_valid_email_address(String email) {


		loginpage.enter_Email(email);
		logger.info("*************Entering an Email********************");
	}

	@When("User enters a valid password {string}")
	public void user_enters_a_valid_password(String pwd) {

		loginpage.enter_Password(pwd);
		logger.info("*************Entering Password********************");
	}

	@When("User clicks on Sign In button")
	public void user_clicks_on_Sign_In_button() throws InterruptedException {

		loginpage.click_Submit();
		logger.info("*************CLicking on Submit********************");

	}

	@Then("Verify profile name should be displayed as {string}")
	public void verify_profile_name_should_be_displayed_as(String expMsg) {

		String actMsg=loginpage.VerifyProfileName();
		if(actMsg.equalsIgnoreCase(expMsg)){

			Assert.assertTrue(true);
			logger.info("*************Login Scenario Test Case Passed********************");
		}

		else {

			Assert.assertTrue(false);
			logger.info("*************Login Scenario Test Case Failed********************");
		}

	}

	//******************************************Account.feature Step Definition*************************************


	@Then("Verify user navigates to the {string} page")
	public void verify_user_navigates_to_the_page(String title) {

		logger.info("------------------>Account Scenrio Test Case Execution:<-----------------------");

		accountpage=new AccountPage(driver);

		String expTitle=driver.findElement(By.xpath("//h3[normalize-space()='Create an account']")).getText();
		if(expTitle.contains(title)) {

			Assert.assertTrue(true);
			logger.info("*************Account Page Title Matched********************");
		}
		else {
			Assert.assertTrue(false);
			logger.info("*************Accountg Page Title Not Matched********************");
		}
	}

	@When("User enters an email id as {string}")
	public void user_enters_an_email_id_as(String email) {

		// Generate random email
		String randomNo=RandomStringUtils.randomAlphabetic(3);
		String randomEmail=randomNo+"@gmail.com";
		accountpage.enter_Email(randomEmail);
		logger.info("*************Entered Email Address********************");
	}

	@When("User clicks on Create an Account button")
	public void user_clicks_on_Create_an_Account_button() throws InterruptedException {

		accountpage.click_CreateAnAcoount();
		logger.info("*************Clicking on Create Account********************");

	}

	@When("User fills all personal details")
	public void user_fills_all_personal_details() throws InterruptedException {

		accountpage.select_Gender();
		logger.info("*************Selecting Gender********************");

		accountpage.enter_FirstName("Matin");
		logger.info("*************Entering Firstname********************");

		accountpage.enter_LastName("Khan");
		logger.info("*************Entering Lastname********************");

		accountpage.enter_Password("Test@123");
		logger.info("*************Entering Password********************");

		accountpage.select_Day();
		logger.info("*************Selecting Day********************");

		accountpage.select_Month();
		logger.info("*************Selecting Month********************");

		accountpage.select_Year();
		logger.info("*************Selecting Year********************");



	}

	@When("User clicks on register link")
	public void user_clicks_on_register_link() throws InterruptedException {

		accountpage.click_Register();
		logger.info("*************Clicking on Register********************");

	}

	@Then("Verify confirmation message for successful registration as {string}")
	public void verify_confirmation_message_for_successful_registration_as(String cmsg) {

		String ActConfMsg=driver.findElement(By.tagName("body")).getText();

		if(ActConfMsg.contains(cmsg)) {


			Assert.assertTrue(true);
			logger.info("*************Account Test Case Passed********************");

		}
		else {

			Assert.assertTrue(false);
			logger.info("*************Account Test Case Failed********************");
		}



	}

	@Then("Close the browser")
	public void close_the_browser() {

		driver.quit();
		logger.info("*************Closing Browser********************");
	}



}
