package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = ("//a[@href='/' and contains(text(), 'Home')]"))
    public WebElement HomeButton;

    public boolean isHomeButtonOrange() {
        String style = HomeButton.getAttribute("style");
        return style.contains("color: orange;");
    }
        @FindBy(xpath = ("//a[@href='/login']"))
        public WebElement singUpButton;


}

