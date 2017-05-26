package signin;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/26/2017.
 */
public class SignInPage extends CommonAPI{

    @FindBy(how = How.CSS, using = "#utilities .utility_list.has_shopping_cart li:nth-child(4)")
    public static WebElement SignIn;

    public static WebElement getSignIn() {
        return SignIn;
    }

    public void clickOnSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignIn().click();
    }
}
