package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteAccountPage;
import utilities.Driver;

public class DeleteAccountStepDefs {
       DeleteAccountPage deleteAccountPage= new DeleteAccountPage();
    @When("user clicks continue button")
    public void userClicksContinueButton() {
        deleteAccountPage.continueButton.click();
    }

    @And("user verifies that logged in")
    public void userVerifiesThatLoggedIn() {
        String expected= " Logged in as " + RegisterUserStepDefs.firstnameString+ " " + RegisterUserStepDefs.lastnameString;
        System.out.println(expected);
        Assert.assertTrue(deleteAccountPage.loggedInVerify.isDisplayed());
    }

    @And("user clicks delete account button")
    public void userClicksDeleteAccountButton() {
        deleteAccountPage.deleteButton.click();
    }

    @Then("user verifies that acount deleted")
    public void userVerifiesThatAcountDeleted() {
        String deleteVerify=  Driver.getDriver().getTitle();
        Assert.assertTrue(deleteVerify.contains("Delete Account"));
    }
}
