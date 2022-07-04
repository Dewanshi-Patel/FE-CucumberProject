package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackgroundPage {
	WebDriver driver;

	public WhiteBackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']")
	WebElement SET_WHITE_BACKGROUND;
	
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement VERIFIED_WHITE_BACKGROUND;

	public void clickOnSetWhiteBackgroundButton() {
		SET_WHITE_BACKGROUND.click();
	}

	public void verifiedBackgroundColorChangeToWhite(){
		String expected1 = "NSS-TODO List v 1.1";
		String actual1 = VERIFIED_WHITE_BACKGROUND.getText();
		System.out.println(actual1);
		Assert.assertEquals(expected1, actual1);
	}

}