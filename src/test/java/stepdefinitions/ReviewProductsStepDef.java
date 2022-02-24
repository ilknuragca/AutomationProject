package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ReviewProductsPage;

import static org.junit.Assert.assertTrue;

public class ReviewProductsStepDef {

    ReviewProductsPage reviewProductsPage= new ReviewProductsPage();

    @And("user clicks view product button")
    public void userClicksViewProductButton() {
        reviewProductsPage.viewProductButton1.click();
    }

    @And("verify write your review is visible")
    public void verifyWriteYourReviewIsVisible() {
        assertTrue(reviewProductsPage.productReview.isDisplayed());
    }

    @And("user enter name, email and review")
    public void userEnterNameEmailAndReview() {
        reviewProductsPage.nameBox.sendKeys(Faker.instance().name().fullName());
        reviewProductsPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        reviewProductsPage.reviewArea.sendKeys("I love your products");
    }

    @And("user clicks submit button in product details page")
    public void userClicksSubmitButtonInProductDetailsPage() {
        reviewProductsPage.submitButton.click();
    }

    @Then("verify success message thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
           assertTrue(reviewProductsPage.successMessage.isDisplayed());
    }
}
