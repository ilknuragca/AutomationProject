package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TC6_ContactUsForm;
import utilities.Driver;
import utilities.ReusableMethods;

public class ContactusStepDefs {

    TC6_ContactUsForm contactUsForm=new TC6_ContactUsForm();

    @When("user clicks contact us button")
    public void user_clicks_contact_us_button() {

        contactUsForm.contactUsButton.click();
    }

    @And("user verifies get in touch text is visible")
    public void userVerifiesGetInTouchTextIsVisible() {

        Assert.assertTrue(contactUsForm.getInTouchText.isDisplayed());
    }

    @And("user enters name, email and subject")
    public void userEntersNameEmailAndSubject() {

        Driver.waitAndSendText(contactUsForm.nameText,"iko" );
        Driver.waitAndSendText(contactUsForm.emailBox,"iko@gmail.com");
        Driver.waitAndSendText(contactUsForm.subjectBox, "return");
        Driver.waitAndSendText(contactUsForm.messageBox, "Hello world");

    }

    @And("user uploads file")
    public void userUploadsFile() {

        String pathOfImage = System.getProperty("user.home")+"/Desktop/download.png";
        Driver.waitAndSendText(contactUsForm.uploadFile, pathOfImage);

    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() throws InterruptedException {

        contactUsForm.submitFile.click();
        Thread.sleep(5000);

    }

    @And("user clicks on OK button")
    public void userClicksOnOKButton() throws InterruptedException {
        Driver.accept();
    }

    @And("verify success message")
    public void verifySuccessMessage() {

        Assert.assertTrue(contactUsForm.successMessage.isDisplayed());
    }

    @Then("user clicks Home button and verifies that landed to home page successfully")
    public void userClicksHomeButtonAndVerifiesThatLandedToHomePageSuccessfully() {

        contactUsForm.homeButton.click();
        String pageTitle= Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", pageTitle);
    }
}
