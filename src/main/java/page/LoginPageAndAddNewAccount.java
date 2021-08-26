package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageAndAddNewAccount {
	WebDriver driver;
	

	public void LoginPageAndAddAccount(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;

	// Element Library for new account creation
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]")
	WebElement BankCash;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccount;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement IntBankUrl;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement Submit;

	// Methods to interact with the elements
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickSignInButton() {
		SignInButton.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickBankCash() {
		BankCash.click();
	}

	public void clickNewAccount() {
		NewAccount.click();
	}

	public void enterAccountTitle(String Accounttitle) {
		AccountTitle.sendKeys(Accounttitle);
	}

	public void enterDescription(String description) {
		Description.sendKeys(description);
	}

	public void enterInitialBalance(String Balance) {
		InitialBalance.sendKeys(Balance);
	}

	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
	}

	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
	}

	public void enterPhone(String phone) {
		Phone.sendKeys(phone);
	}

	public void enterIntBankUrl(String bankUrl) {
		IntBankUrl.sendKeys(bankUrl);
	}

	public void clickSubmitButton() {
		Submit.click();
	}

	public void loginAndAddAccount(String userName, String password, String Accounttitle, String description,
			String Balance, String accountNumber, String contactPerson, String phone, String bankUrl) {
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		SignInButton.click();
		BankCash.click();
		NewAccount.click();
		AccountTitle.sendKeys(Accounttitle);
		Description.sendKeys(description);
		InitialBalance.sendKeys(Balance);
		AccountNumber.sendKeys(accountNumber);
		ContactPerson.sendKeys(contactPerson);
		Phone.sendKeys(phone);
		IntBankUrl.sendKeys(bankUrl);
		Submit.click();

	}
}