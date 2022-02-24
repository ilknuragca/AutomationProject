package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AddToCartRecommendedItemsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class AddToCartRecomendedStepDefs {

    AddToCartRecommendedItemsPage recommendedItemsPage= new AddToCartRecommendedItemsPage();

    @And("user scrolls down page to bottom")
    public void userScrollsDownPageToBottom() {
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();

    }

    @And("verify recommended items are visible")
    public void verifyRecommendedItemsAreVisible() {
        assertTrue(recommendedItemsPage.recommendedItems.isDisplayed());
    }

    @And("user clicks add to cart on Recommended product")
    public void userClicksAddToCartOnRecommendedProduct() {
         Driver.waitAndClick(recommendedItemsPage.recommendedAddToCart);
         Driver.wait(3);
        recommendedItemsPage.viewCart.click();

    }

    @And("verifies product is displayed in cart page")
    public void verifiesProductIsDisplayedInCartPage() {
        assertTrue(recommendedItemsPage.productInCart.isDisplayed());
    }
}
