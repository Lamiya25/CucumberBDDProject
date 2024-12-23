package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = ("//input[@id='id_gender2']"))
    public WebElement title;

    @FindBy(xpath = ("//input[@id='password']"))
    public WebElement password;

    @FindBy(id = ("days"))
    public WebElement dayOfBirth;

    @FindBy(id = ("months"))
    public WebElement monthOfBirth;

    @FindBy(id = ("years"))
    public WebElement yearsOfBirth;

@FindBy(xpath = ("//input[@id='newsletter']"))
    public WebElement forNewSettler;

    @FindBy(xpath = ("//input[@id='optin']"))
    public WebElement forSpecialOffers;


    @FindBy(xpath = ("//input[@id='first_name']"))
    public WebElement firstName;

    @FindBy(xpath = ("//input[@id='last_name']"))
    public WebElement lastName;

    @FindBy(xpath = ("//input[@id='company']"))
    public WebElement company;

    @FindBy(xpath = ("//input[@data-qa='address']"))
    public WebElement adress;

    @FindBy(xpath = ("//input[@data-qa='address2']"))
    public WebElement adress2;

    @FindBy(xpath = ("//select[@data-qa='country']"))
    public WebElement country;

    @FindBy(xpath = ("//input[@data-qa='state']"))
    public WebElement state;

    @FindBy(xpath = ("//input[@data-qa='city']"))
    public WebElement city;

    @FindBy(xpath = ("//input[@data-qa='zipcode']"))
    public WebElement zipCode;

    @FindBy(xpath = ("//input[@data-qa='mobile_number']"))
    public WebElement mobileNumber;

    @FindBy(xpath = ("//button[@data-qa='create-account']"))
    public WebElement createAccountButton;

    @FindBy(xpath = ("//h2[@data-qa='account-created']/b"))
    public WebElement accountCreatedWord;

    @FindBy(xpath = ("//a[@data-qa='continue-button']"))
    public WebElement continueButton;
}
