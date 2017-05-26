package findingstore;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/25/2017.
 */
public class FindingStarbucks extends CommonAPI{

    @FindBy(how = How.CSS, using = "#utilities .utility_list.has_shopping_cart li:nth-child(3)")
    public static WebElement StoreLocation;

    public static WebElement getStoreLocation() {
        return StoreLocation;
    }
    public void clickOnFindStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStoreLocation().click();
    }
    public void goToFindStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnFindStore();
    }
    public void typeZipCode(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeByCss("input[name='place']", "27513");
        clickByCss(".button___vvJBH");
    }
}
