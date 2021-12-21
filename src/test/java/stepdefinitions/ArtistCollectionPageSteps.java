package stepdefinitions;

import com.pages.ArtistCollectionPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArtistCollectionPageSteps {

	private ArtistCollectionPage artistCollectionPage = new ArtistCollectionPage(DriverFactory.getDriver());

	@Given("user clicks on heart button for art {string}")
	public void user_clicks_on_heart_button_for_art(String artName){
		artistCollectionPage.clickHeartButton(artName);
	}
	
	@When("user selects existing collection set {string}")
	public void user_selects_collection_set_name(String collectionName){
		artistCollectionPage.clickCollectionName(collectionName);
	}
	
	@Then("add to my collection dialog should close")
	public void wait_for_dialog_to_close(){
		artistCollectionPage.waitForDialogClosure();
	}
}
