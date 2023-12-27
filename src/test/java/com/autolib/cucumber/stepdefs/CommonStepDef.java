package com.autolib.cucumber.stepdefs;

import org.junit.Assert;

import com.autolib.pages.Category;
import com.autolib.pages.Home;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDef extends BaseStepDef {

	@Before
	public void setUpHook() {
		initializeDriver();
	}

	@After
	public void tearDownHook() {
		tearDown();
	}

	@Given("user navigates to {string} page")
	public void user_navigates_to_page(String string) {
		home = new Home(driverManager.getDriver());
		home.openURL();
	}

	@When("user selects {string} from global navigation")
	public void user_selects_from_global_navigation(String string) {
		home.getGlobalNavigation().clickOnMainMenuNavigationLink(string);
	}

	@Then("user should see {string} product in top list")
	public void user_should_see_product_in_top_list(String item) {
		category = new Category(driverManager.getDriver());
		Assert.assertTrue(category.getChapterNavigation().isItemAvailableInChapterNavList(item));
	}

}
