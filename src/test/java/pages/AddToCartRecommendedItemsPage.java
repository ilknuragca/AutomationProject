package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddToCartRecommendedItemsPage {
    public AddToCartRecommendedItemsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement recommendedItems;

    @FindBy(xpath = "(//a[@data-product-id='2' and @class='btn btn-default add-to-cart'])[3]")
    public WebElement recommendedAddToCart;

    @FindBy(xpath = "//*[@id='cart_info']")
    public WebElement productInCart;

    @FindBy(xpath= "(//a[@href='/view_cart'])[2]")
    public WebElement viewCart;

}
