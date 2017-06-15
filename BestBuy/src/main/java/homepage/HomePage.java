package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by saadi on 6/14/2017.
 */
public class HomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = "#menu0")
    public static WebElement products;

    public static WebElement getProducts() {
        return products;
    }
    public void clickOnProductsTab(){
        getProducts().click();
    }
    public void goToProducts(){
        clickOnProductsTab();
    }
}
