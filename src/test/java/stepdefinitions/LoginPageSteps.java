package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on home page with url {string}")
	public void user_is_on_home_page(String applicationUrl) {
		DriverFactory.getDriver().get(applicationUrl);
	}

	@And("user accept cookies consent")
	public void use_accept_cookies_consent(){
		loginPage.acceptCookies();
	}
	
	@When("user clicks on Login link")
	public void click_on_login_link(){
		loginPage.clickOnLoginLink();
	}
	
	@Then("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}
		
	@Then("page title should be {string}")
	@And("page title must be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@And("user enters username {string}")
	public void user_enters_username(String username)
	{
		loginPage.enterUserName(username);
	}

	@And("user enters password {string}")
	public void user_enters_password(String password) 
	{
		loginPage.enterPassword(password);
	   }

	@And("user clicks on Login button")
	public void user_clicks_on_login_button()
	{
		loginPage.clickOnLogin();
	}
	
	@Then("^wait for (.*) seconds to load avatar card$")
	public void wait_for_avatar_card(int waitTime){
		System.out.println("waiting " + waitTime + " seconds for element: Avatar card");
		loginPage.waitForAvatarCard(waitTime);
		
	}
	
	@And("logged in avathar card should be {string}")
	public void logged_in_avathar_card_should_match(String cardName){
		Assert.assertTrue(cardName.equals(loginPage.readAvatarCard()));
	}
}
