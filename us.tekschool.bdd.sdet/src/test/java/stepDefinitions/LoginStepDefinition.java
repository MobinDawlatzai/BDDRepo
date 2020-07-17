package stepDefinitions;
import org.junit.Assert;

import core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.LoginPageObj;

public class LoginStepDefinition extends Base {

	// create Obj of LoginPageObj
	LoginPageObj loginPageObj = new LoginPageObj();

	@Given("^User is on TEST Environment page$")
	public void user_is_on_TEST_Environment_page() throws Throwable {
		Base.initializeDriver();

	}

	@When("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		loginPageObj.clickOnMyAccount();

	}

	@When("^User click on Login$")
	public void user_click_on_Login() throws Throwable {
		loginPageObj.clickOnLogin();
	}
	// (.+) - using this special characters we can parameterize the method so we can
	// use same method with different values

	@When("^User enters username '(.+)' and Password '(.+)'$")
	public void user_enters_username_sdet_tekschool_us_and_Password_sdet(String userName, String passWord)
			throws Throwable {
		loginPageObj.enterEmail(userName);
		loginPageObj.enterPassword(passWord);

	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		loginPageObj.clickOnLoginButton();

	}

	@Then("^User Should be logged in to user Dashboard$")
	public void user_Should_be_logged_in_to_user_Dashboardr_enters_username_sdet_tekschool_com_and_Password()
			throws Throwable {

		String expectedPageTitle = "My Account";
		String actualPageTitle = loginPageObj.getPageTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);

	}
	@When("^User click on Logout$")
	public void User_click_on_Logout() {
		loginPageObj.clickOnLogout();
			
		
		
	}
	@Then("^User should be logged out$")
	public void User_should_be_logged_out() {
		String ExPageTitle="Account Logout";
		String actualPageTitle = loginPageObj.getPageTitle();
		Assert.assertEquals(ExPageTitle, actualPageTitle);
	}
//	@When("^User click on Register$")
//	public void user_click_on_Register() throws Throwable {
//		loginPageObj.clickOnRegister();
//	    
//	}

	@Then("^User enter firstName '(.+)'$")
	public void user_enter_first_name_Divid(String firstname) throws Throwable {
		loginPageObj.enterFirstName(firstname);
	}

	@Then("^User enter lastName '(.+)'$")
	public void user_enter_last_Name_Jackson(String lastname) throws Throwable {
		loginPageObj.enterLastName(lastname);
		

	}

	@Then("^User enter a valid email '(.+)'$")
	public void user_enter_a_valid_email_ad_email_com(String eamilAdress) throws Throwable {
		loginPageObj.enterEmailAdd(eamilAdress);

	}
	@Then("^User enter valid phoneNumber '(.+)'$")
	public void user_enter_valid_phone_number(String phoneNumber) throws Throwable {
		loginPageObj.enterPhoneNo(phoneNumber);

	}

	@Then("^User enter the password '(.+)'$")
	public void user_enter_the_password_zebra(String password) throws Throwable {
		loginPageObj.enterPassword1(password);

	}

	@Then("^User enter confirm password '(.+)'$")
	public void user_enter_confirm_password_zebra(String confirmPass) throws Throwable {
		loginPageObj.enterConPassword(confirmPass);

	}

	@Then("^User Verify that No option is selected as default$")
	public void user_Verify_that_No_option_is_selected_as_default() throws Throwable {
		loginPageObj.noRadioButtonSelected();

	}

	@Then("^User clicks on privacey policy check box$")
	public void user_clicks_on_privacey_policy_check_box() throws Throwable {
		loginPageObj.clickOnPrivacyCheckBox();

	}

	@Then("^Click on Continue button$")
	public void click_on_Continue_button() throws Throwable {
		loginPageObj.clickOnContinueBtn();

	}

	@Then("^Verify the Congratulation message$")
	public void verify_the_Congratulation_message() throws Throwable {

	}

}
