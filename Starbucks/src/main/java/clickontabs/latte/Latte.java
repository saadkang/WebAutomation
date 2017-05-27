package clickontabs.latte;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/27/2017.
 */
public class Latte extends CommonAPI{

    @FindBy(how = How.CSS, using = "#menu_coffee div:nth-child(1) ol:nth-child(1) li:nth-child(4) ol:nth-child(2) li:nth-child(7) a:nth-child(1)")
    public static WebElement coffeeLatte;

    @FindBy(how = How.CSS, using = ".blocks:nth-child(4) li:nth-child(10) a:nth-child(1) dl:nth-child(1) dd:nth-child(2) span:nth-child(1)")
    public static WebElement skinnyLatte;

    public static WebElement getCoffeeLatte() {
        return coffeeLatte;
    }

    public static WebElement getSkinnyLatte() {
        return skinnyLatte;
    }

    public void clickOnCoffeeLatte(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCoffeeLatte().click();
    }
    public void clickOnSkinnyLatte(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSkinnyLatte().click();
    }
    public void goToCoffeeLatte(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCoffeeLatte();
    }
    public void goToSkinnyLatte(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSkinnyLatte();
    }
}
