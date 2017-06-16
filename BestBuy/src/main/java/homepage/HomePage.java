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

    @FindBy(how = How.CSS, using = "#menu1")
    public static WebElement brands;

    public static WebElement getBrands() {
        return brands;
    }
    public static WebElement getProducts() {
        return products;
    }
    public void clickOnProductsTab(){
        getProducts().click();
    }
    public void clickOnBrand(){
        getBrands().click();
    }
    public void goToProducts(){
        clickOnProductsTab();
    }
    public void goToBrand(){
        clickOnBrand();
    }
}
