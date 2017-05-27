package clickontabs.reloadcard;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/27/2017.
 */
public class ReloadCard extends CommonAPI{

    @FindBy(how = How.CSS, using = "#menu_card div:nth-child(1) ol:nth-child(1) li:nth-child(2) ol:nth-child(2) li:nth-child(2) a:nth-child(1)")
    public static WebElement reloadingCard;

    public static WebElement getReloadingCard() {
        return reloadingCard;
    }
    public void clickOnReloadCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getReloadingCard().click();
    }
    public void goToReloadCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnReloadCard();
    }
}
