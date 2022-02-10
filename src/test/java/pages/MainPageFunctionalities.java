package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPageFunctionalities {

    public MainPageFunctionalities() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText = "Signup")
    public WebElement signupButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement singUpButton2;




}
