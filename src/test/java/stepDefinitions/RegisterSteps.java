package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.MainPage;
import pages.RegisterPage;
import pages.SignUpSignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Helper;

public class RegisterSteps {
SignUpSignInPage signUpSignInPage= new SignUpSignInPage();
RegisterPage registerPage= new RegisterPage();
MainPage mainPage=new MainPage();
    @Given("I navigate to url {string}")
    public void iNavigateToUrl(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("I verify that home page is visible successfully")
    public void iVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue("Home page is not visible!", mainPage.isHomeButtonOrange());
        System.out.println("Home page is visible successfully");

    }

    @When("I click on signUp button")
    public void iClickOnButton() {
        mainPage.singUpButton.click();
    }

    @Then("I verify New User Signup! is visible")
    public void iVerifyIsVisible() {
        Assert.assertTrue("'New User Signup!' is NOT visible!", signUpSignInPage.isNewUserSignupVisible());
        System.out.println("'New User Signup!' is visible.");
    }

    @When("I enter name {string} and email address {string} and click signup button")
    public void iEnterNameAndEmailAddress(String name, String email) {
        signUpSignInPage.nameField.sendKeys(name);
        signUpSignInPage.emailField.sendKeys(email);
        signUpSignInPage.signupButton.click();

    }

    @And("I fill in account details with Title {string}, Password {string}, and Date of birth Day {string} Month {string} Year {string}")
    public void iFillInAccountDetails(String title, String password, String day, String month, String year) {
        registerPage.title.click();
        registerPage.password.sendKeys(password);
        Select selectDay = new Select(registerPage.dayOfBirth);
        selectDay.selectByVisibleText(day);

        Select selectMonth = new Select(registerPage.monthOfBirth);
        selectMonth.selectByVisibleText(month);

        Select selectYear = new Select(registerPage.yearsOfBirth);
        selectYear.selectByVisibleText(year);

    }

    @And("I select the checkbox Sign up for our newsletter!")
    public void iSelectTheCheckboxNewsletter() {
        registerPage.forNewSettler.click();
       Helper.wait(3);
    }

    @And("I select the checkbox Receive special offers from our partners!")
    public void iSelectTheCheckboxPartner() {
        registerPage.forSpecialOffers.click();
        Helper.wait(3);
    }

    @And("I fill address details: First name {string}, Last name {string}, Company {string}, Address {string}, Address2 {string}, Country {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
    public void iFillAddressDetails(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        registerPage.firstName.sendKeys(firstName);
        registerPage.lastName.sendKeys(lastName);
        registerPage.company.sendKeys(company);
        registerPage.adress.sendKeys(address);
        registerPage.adress2.sendKeys(address2);
        Select selectCountry = new Select(registerPage.country);
        selectCountry.selectByVisibleText(country);
        registerPage.state.sendKeys(state);
        registerPage.city.sendKeys(city);
        registerPage.zipCode.sendKeys(zipcode);
        registerPage.mobileNumber.sendKeys(mobileNumber);
    }

    @When("I click Create Account button")
    public void i_click() {
        registerPage.createAccountButton.click();
    }

    @Then("I verify that {string} is visible")
    public void iVerifyThatIsVisibleAndClickButton(String text) {
        Helper.wait(5);
        Assert.assertTrue(text, registerPage.accountCreatedWord.isDisplayed());
        System.out.println("Account Created is visible.");
    }

    @Then("I click Continue button")
    public void clickCountinueButton(){

   registerPage.continueButton.click();
    }

}