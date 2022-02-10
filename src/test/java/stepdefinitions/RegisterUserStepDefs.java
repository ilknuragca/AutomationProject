package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.FillDetailsPage;
import pages.MainPageFunctionalities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegisterUserStepDefs {

    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();
    FillDetailsPage fillDetailsPage =new FillDetailsPage();
    Select select;
    static String firstnameString=Faker.instance().name().firstName();
    static String lastnameString=Faker.instance().name().lastName();

    @When("user launches the browser")
    public void user_launches_the_browser() {

        Driver.getDriver();
    }
    @When("user navigates to home page")
    public void user_navigates_to_home_page() {

        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("automation_url"));

    }
    @Then("user verifies home page is visible")
    public void user_verifies_home_page_is_visible() {

        String homePageTitle= Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", homePageTitle);

    }
    @Then("user clicks on signup button")
    public void user_clicks_on_signup_button() {

        mainPageFunctionalities.signupButton.click();

    }
    @Then("user verifies new user signup is visible")
    public void user_verifies_new_user_signup_is_visible() {

        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());
    }

    @When("user enters name and email")
    public void user_enters_name_and_email() {
           mainPageFunctionalities.nameBox.sendKeys(firstnameString+" "+lastnameString);
           mainPageFunctionalities.emailBox.sendKeys(Faker.instance().internet().emailAddress());

    }
    @When("user clicks signup button")
    public void user_clicks_signup_button() {
       mainPageFunctionalities.singUpButton2.click();
    }
    @When("user verifies that enter account information is visible")
    public void user_verifies_that_enter_account_information_is_visible() {
      Assert.assertTrue(fillDetailsPage.enterAccountText.isDisplayed());
    }

}
