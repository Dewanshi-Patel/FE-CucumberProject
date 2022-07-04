package steps;


import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.BGTestBasePage;
import pages.SkyBlueBackgroundPage;
import pages.WhiteBackgroundPage;

public class BGStepDefinition extends BGTestBasePage {
	SkyBlueBackgroundPage SkyBlueBackgroundPageObj;
	WhiteBackgroundPage WhiteBackgroundPageObj;

	@Before
	public void beforeRun() {
		initDriver();
		WhiteBackgroundPageObj = PageFactory.initElements(driver, WhiteBackgroundPage.class);
		SkyBlueBackgroundPageObj = PageFactory.initElements(driver, SkyBlueBackgroundPage.class);
		
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		driver.get("http://techfios.com/test/103/");
	}

	@When("^I click on the button$")
	public void I_click_on_the_button() {
		SkyBlueBackgroundPageObj.clickOnSetSkyblueBackgroundButton();
		
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		SkyBlueBackgroundPageObj.verifiedBackgroundColorChangeToSkyblue();

	}

	@Given("^Set White Background button exists$")
	public void set_White_Background_button_exists() {
		driver.get("http://techfios.com/test/103/");

	}

	@When("^I click on the button1$")
	public void I_click_on_the_button1() {
		WhiteBackgroundPageObj.clickOnSetWhiteBackgroundButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		WhiteBackgroundPageObj.verifiedBackgroundColorChangeToWhite();
		}
	

	

	// @After
	public void teardown() {
		driver.close();
		driver.quit();

	}

}
