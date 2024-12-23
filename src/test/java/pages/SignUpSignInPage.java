package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpSignInPage {
    public SignUpSignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = ("//input[@data-qa='signup-name']"))
    public WebElement nameField;

    @FindBy(xpath = ("//input[@data-qa='signup-email']"))
    public WebElement emailField;

    @FindBy(xpath = ("//button[@data-qa='signup-button']"))
    public WebElement signupButton;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUserSignupText;

    public boolean isNewUserSignupVisible() {
        return newUserSignupText.isDisplayed();
    }


}