package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.SearchProductPage;

import static org.junit.Assert.assertTrue;

public class SearchProductStepDef {

    SearchProductPage searchProductPage=new SearchProductPage();

    @When("enters product name in search input and click search button")
    public void enters_product_name_in_search_input_and_click_search_button() {

       searchProductPage.searchBox.sendKeys("Blue Top" );
       searchProductPage.searchButton.click();

    }
    @When("verify search products is visible")
    public void verify_search_products_is_visible() {
          assertTrue(searchProductPage.searchedProductsText.isDisplayed());
    }

    @And("user clicks cart button at product page")
    public void userClicksCartButtonAtProductPage() {
        searchProductPage.viewChart.click();
    }
}
