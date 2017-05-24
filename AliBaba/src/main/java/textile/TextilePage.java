package textile;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/23/2017.
 */
public class TextilePage extends CommonAPI{

    public void textilePageCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCategoriesTextileTab();
    }
}
