package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

// it is  WEBELEMENT REPOSITORY

	@FindBy(xpath = "//*[@name='username']")
	private WebElement usnTB;
	@FindBy(xpath = "//*[@name='pwd']")
	private WebElement passTB;
	@FindBy(xpath = "//*[@id='keepLoggedInCheckBox']")
	private WebElement CheckBox;
	@FindBy(xpath = "//*[@id='loginButton']")
	private WebElement lBtn;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getlBtn() {
		return lBtn;
	}

//
	public void validLoginMethod(String ValidUsername, String ValidPassword) {
		usnTB.sendKeys(ValidUsername);
		passTB.sendKeys(ValidPassword);

	}
}