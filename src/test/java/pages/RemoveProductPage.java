package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RemoveProductPage {
   public RemoveProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]" )
    public WebElement deleteButton;

   @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[2]" )
   public WebElement delete2Button;

    @FindBy(xpath = "//*[text()='Cart is empty!']")
    public  WebElement cartEmptyText;
}

