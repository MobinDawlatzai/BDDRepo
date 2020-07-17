package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObj extends Base {

	// Create a constructor

	public LoginPageObj() {

		// we will use initElements to initialize all webElements in this page
		PageFactory.initElements(driver, this);

	}
	// storing webElemnets for login Page
	// @FindBy annotation used in pageFactory to find webElemnets

	@FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	private WebElement myAccount;

	// storing webElement login
	@FindBy(how = How.XPATH, using = "//a[text()= 'Login']")
	private WebElement login;

	// Storing Email webElement
	@FindBy(how = How.XPATH, using = "//*[@id='input-email']")
	private WebElement Email;

	// Storing password
	@FindBy(how = How.XPATH, using = "//*[@id='input-password']")
	private WebElement Password;

	// storing Login Button
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement loginButton;
	// Storing Logout Butto
	@FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	private WebElement logoutButton;

	@FindBy(how = How.XPATH, using = "//a[text()='Register']")
	private WebElement Register;

	@FindBy(how = How.XPATH, using = "//*[@id=\"input-firstname\"]")
	private WebElement firstName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"input-lastname\"]")
	private WebElement lastName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"input-email\"]")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//*[@id=\"input-telephone\"]")
	private WebElement phone;

	@FindBy(how = How.XPATH, using = "//*[@id=\"input-password\"]")
	private WebElement FirstPassword;

	@FindBy(how = How.XPATH, using = "//*[@id=\"input-confirm\"]")
	private WebElement Confirmpassd;

	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
	private WebElement noRadioButton;

	@FindBy(how = How.XPATH, using = "//input[@name='agree']")
	private WebElement privacyCheckBox;

	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement Continue;

	// start writing methods.

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmail(String emailAddress) {
		Email.clear();
		Email.sendKeys(emailAddress);
	}

	public void enterPassword(String password) {
		Password.clear();
		Password.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void clickOnLogout() {
		logoutButton.sendKeys(Keys.ENTER);

	}

//	public void clickOnRegister() {
//		Register.click();
//	}

	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void enterEmailAdd(String emailAdress) {

		email.sendKeys(emailAdress);
	}

	public void enterPhoneNo(String phoneNumber) {
		phone.sendKeys(phoneNumber);
	}

	public void enterPassword1(String password) {
		FirstPassword.sendKeys(password);

	}

	public void enterConPassword(String Confirmpassword) {
		Confirmpassd.sendKeys(Confirmpassword);
	}

	public void noRadioButtonSelected() {
		if (!noRadioButton.isSelected()) {
			noRadioButton.click();

		}

	}

	public void clickOnPrivacyCheckBox() {
		privacyCheckBox.click();
	}

	public void clickOnContinueBtn() {
		Continue.click();

	}

}
