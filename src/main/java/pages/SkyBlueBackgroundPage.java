package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueBackgroundPage {

	WebDriver driver;

	public SkyBlueBackgroundPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']")
	WebElement SET_SKYBLUE_BACKGROUND;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement VERIFIED_SKYBLUE_BACKGROUND;

	public void clickOnSetSkyblueBackgroundButton() {
		SET_SKYBLUE_BACKGROUND.click();
	}

	public void verifiedBackgroundColorChangeToSkyblue() {
		String expected =  "NSS-TODO List v 1.1"; 
		String actual = VERIFIED_SKYBLUE_BACKGROUND.getText();
		Assert.assertEquals(expected, actual);

	}

}
