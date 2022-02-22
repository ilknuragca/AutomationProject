package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RemoveProductPage;
import utilities.Driver;

public class RemoveProductStepDef {

    RemoveProductPage removeProductPage=new RemoveProductPage();

    @Then("user clicks x button corresponding to particular procduct")
    public void user_clicks_x_button_corresponding_to_particular_procduct() {
        removeProductPage.deleteButton.click();
        Driver.wait(3);
        removeProductPage.delete2Button.click();
    }

    @Then("verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() {
      Assert.assertTrue(removeProductPage.cartEmptyText.isDisplayed());
    }
}
