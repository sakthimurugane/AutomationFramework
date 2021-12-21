package stepdefinitions;

import com.pages.SearchPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SearchPageSteps {
	private SearchPage searchPage = new SearchPage(DriverFactory.getDriver());
	
	@When("user enters {string} in Name field and selects {string}")
	public void user_enter_name_and_selects(String firstName, String lastName){
		searchPage.setNameField(firstName, lastName);
	}
	@And("user clicks on Advanced search link")
	public void user_clicks_on_advanced_search_link(){
		searchPage.clickAdvancedSearchLink();
	}
	
	@And("user select Image only checkbox")
	public void user_clicks_on_iamge_only_checkbox(){
		searchPage.clickImageOnlyCheckBox();
	}
	
	@And("user enters title {string}")
	public void user_enters_title(String value){
		searchPage.setTitleField(value);
	}
	
	@And("user enters from year {string}")
	public void user_enters_from_year(String value){
		searchPage.setFromYear(value);
	}
	
	@And("user enters to year {string}")
	public void user_enters_to_year(String value){
		searchPage.setToYear(value);
	}
	
	@And("user clicks on find button")
	public void user_clicks_on_find_button(){
		searchPage.clickOnFindButton();
	}
}
