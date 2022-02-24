package stepdefinitions;

import io.cucumber.java.en.When;
import pages.ViewBrandPrpducts;
import pages.ViewCategoryProductsPage;

import static org.junit.Assert.assertTrue;

public class ViewBrandProductsStepDef {
    ViewBrandPrpducts viewPage=new ViewBrandPrpducts();

    @When("verify that brands are visible on left sidebar")
    public void verify_that_brands_are_visible_on_left_sidebar() {
         assertTrue(viewPage.brands.isDisplayed());

    }
    @When("user clicks on any brand name")
    public void user_clicks_on_any_brand_name() {
          viewPage.poloProducts.click();

    }
    @When("verify that user is navigated to brand page and brand products are displayed")
    public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
           assertTrue(viewPage.poloProductsText.isDisplayed());

    }
    @When("On left sidebar, click on any other brand link")
    public void on_left_sidebar_click_on_any_other_brand_link() {

            viewPage.hmproducts.click();

    }
    @When("verify that user is navigated to that brand page and can see products")
    public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {

       assertTrue(viewPage.hmProductsText.isDisplayed());
    }

}
