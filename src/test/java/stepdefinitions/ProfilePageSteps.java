package stepdefinitions;


import org.junit.Assert;

import com.pages.ProfilePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePageSteps {
	private ProfilePage profilePage = new ProfilePage(DriverFactory.getDriver());
	
	@Given("user navigates to my profile by clicking {string} avatar")
	public void user_clicks_on_avatar_logo(String avatarName){
		profilePage.clickMyProfileAvatar();
	}
	
	@When("user selects collection {string} in profile")
	public void user_select_collection_in_profile(String collectionName){
		profilePage.clickCollectionInProfile(collectionName);
	}
	
	@Then("{string} should be present in Profile collection")
	public void checkIfGivenImageIsPresent(String artName){
		Assert.assertTrue(profilePage.checkImageIsPresent(artName));
	}
	
	@And("clicks on Get started button in profile")
	public void click_on_get_started_button_in_profile(){
		try{
			profilePage.clickGetStartedButton();
		}
		catch(Exception e){
			
		}
	}
}
