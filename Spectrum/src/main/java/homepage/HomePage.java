package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 6/4/2017.
 */
public class HomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = ".listComponent.section.list-inline .list-component .list-inline li:nth-child(3)")
    public static WebElement Account;

    public static WebElement getAccount() {
        return Account;
    }
    public void clickOnAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAccount().click();
    }
    public void goToAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnAccount();
    }
}
