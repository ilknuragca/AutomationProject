package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.FillDetailsPage;
import utilities.Driver;

public class FillDetailsStepDefs {

    FillDetailsPage fillDetailsPage =new FillDetailsPage();
    RegisterUserStepDefs registerUserStepDefs=new RegisterUserStepDefs();
    String password=Faker.instance().internet().password();

    @When("user fills details")
    public void user_fills_details() {
        fillDetailsPage.radiogender.click();
        fillDetailsPage.passwordBox.sendKeys(password);
        Driver.selectByIndex(fillDetailsPage.daysDropDown,5);
        Driver.selectByIndex(fillDetailsPage.monthsDropDown,5);
        Driver.selectByIndex(fillDetailsPage.yearsDropDown,20);

    }
    @When("user selects checkbox signup for our newslater")
    public void user_selects_checkbox_signup_for_our_newslater() {
        fillDetailsPage.newsletterCheckBox.click();
    }
    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {
        fillDetailsPage.optinCheckBox.click();
    }

    @When("user fills details2")
    public void user_fills_details2() {
        fillDetailsPage.firstNameBox.sendKeys(registerUserStepDefs.firstnameString);
        fillDetailsPage.lastNameBox.sendKeys(registerUserStepDefs.lastnameString);
        fillDetailsPage.companyNameBox.sendKeys(Faker.instance().company().name());
        fillDetailsPage.address1NameBox.sendKeys(Faker.instance().address().streetAddress());
        fillDetailsPage.address2NameBox.sendKeys(Faker.instance().address().secondaryAddress());
        Driver.selectByIndex(fillDetailsPage.countryDropDownBox,3);
        fillDetailsPage.stateBox.sendKeys(Faker.instance().address().state());
        fillDetailsPage.cityBox.sendKeys(Faker.instance().address().city());
        fillDetailsPage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillDetailsPage.mobilenumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
    }

    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        fillDetailsPage.createAccountButton.click();
    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {
        Assert.assertTrue(fillDetailsPage.accountCreateText.isDisplayed());
    }


}
