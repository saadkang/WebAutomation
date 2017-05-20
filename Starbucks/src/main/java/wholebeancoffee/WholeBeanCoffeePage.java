package wholebeancoffee;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/17/2017.
 */
public class WholeBeanCoffeePage extends CommonAPI{

    public void wholeBeanCoffeeLaunch(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToWholeBeanCoffee();
    }
}
