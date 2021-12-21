package stepdefinitions;

import com.pages.CollectionPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExploreCollectionPageSteps {
	
	private CollectionPage collectionPage = new CollectionPage(DriverFactory.getDriver());

	@When("user clicks on hamburger icon")
	public void user_clicks_on_hamburger_icon(){
		collectionPage.clickHamburgerIcon();
	}
	
	@And("user clicks on explore studio link")
	public void user_clicks_on_explore_studio_link(){
		collectionPage.clickExploreStudioLink();
	}
	
	@When("user clicks on artist name {string}")
	public void user_clicks_on_artists_name(String artistName){
		collectionPage.clickArtistName(artistName);
	}
	
	@Given("user clicks on search studio button")
	public void user_clicks_on_search_studio_button(){
		collectionPage.clickSearchStudio();
	}
}
