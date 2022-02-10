package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.RegisterUserStepDefs;
import utilities.Driver;

public class FillDetailsPage {
   public FillDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()='Enter Account Information']") // //b[contains(text(),'Enter Account Information')]
    public WebElement enterAccountText;

    @FindBy(id="id_gender1")
    public WebElement radiogender;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id="days")
    public WebElement daysDropDown;

    @FindBy(id="months")
    public WebElement monthsDropDown;

    @FindBy(id="years")
    public WebElement yearsDropDown;

    @FindBy(id="newsletter")
    public WebElement  newsletterCheckBox;

    @FindBy(id="optin")
    public WebElement  optinCheckBox;

    @FindBy(id="first_name")
    public WebElement  firstNameBox;

    @FindBy(id="last_name")
    public WebElement  lastNameBox;

    @FindBy(id="company")
    public WebElement  companyNameBox;

    @FindBy(id="address1")
    public WebElement  address1NameBox;

    @FindBy(id="address2")
    public WebElement  address2NameBox;

    @FindBy(id="country")
    public WebElement countryDropDownBox;

    @FindBy(id="state")
    public WebElement  stateBox;

    @FindBy(id="city")
    public WebElement  cityBox;

    @FindBy(id="zipcode")
    public WebElement  zipcodeBox;

    @FindBy(id="mobile_number")
    public WebElement  mobilenumberBox;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement accountCreateText;


}
