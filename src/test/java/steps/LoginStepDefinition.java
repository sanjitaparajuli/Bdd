package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPageAndAddNewAccount;
import page.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPageAndAddNewAccount LoginPageAndAddNewAccountObj;

	@Before
	public void beforeRun() {
		initDriver();
		LoginPageAndAddNewAccountObj = PageFactory.initElements(driver, LoginPageAndAddNewAccount.class);
	}

	@Given("^user is on the TechFios login page$")
	public void user_is_on_the_TechFios_login_page() throws Throwable {
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterUserName(arg1);
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterPassword(arg1);
	}

	@When("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
		LoginPageAndAddNewAccountObj.clickSignInButton();
	}

	@Then("^user should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = LoginPageAndAddNewAccountObj.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(4000);
	}

	@When("^user clicks the Bank & Cash button$")
	public void user_clicks_the_Bank_Cash_button() throws Throwable {
		LoginPageAndAddNewAccountObj.clickBankCash();
	}

	@When("^user clicks New Account button$")
	public void user_clicks_New_Account_button() throws Throwable {
		LoginPageAndAddNewAccountObj.clickNewAccount();
	}

	@Then("^user should see add new account page$")
	public void user_should_see_add_new_account_page() throws Throwable {
		LoginPageAndAddNewAccountObj.clickNewAccount();
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = LoginPageAndAddNewAccountObj.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Thread.sleep(4000);

	}

	@When("^user enters AccountTitle as \"([^\"]*)\"$")
	public void user_enters_AccountTitle_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterAccountTitle(arg1);
	}

	@When("^user enters Description as \"([^\"]*)\"$")
	public void user_enters_Description_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterDescription(arg1);
	}

	@When("^user enters Initial Balance as \"([^\"]*)\"$")
	public void user_enters_Initial_Balance_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterInitialBalance(arg1);
	}

	@When("^user enters Account Number as \"([^\"]*)\"$")
	public void user_enters_Account_Number_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterAccountNumber(arg1);
	}

	@When("^user enters Contact Person as \"([^\"]*)\"$")
	public void user_enters_Contact_Person_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterContactPerson(arg1);
	}

	@When("^user enters Phone as \"([^\"]*)\"$")
	public void user_enters_Phone_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterPhone(arg1);
	}

	@When("^user enters Internet Banking URL as \"([^\"]*)\"$")
	public void user_enters_Internet_Banking_URL_as(String arg1) throws Throwable {
		LoginPageAndAddNewAccountObj.enterIntBankUrl(arg1);
	}

	@When("^user clicks the Submit button$")
	public void user_clicks_the_Submit_button() throws Throwable {
		LoginPageAndAddNewAccountObj.clickSubmitButton();
	}
}
