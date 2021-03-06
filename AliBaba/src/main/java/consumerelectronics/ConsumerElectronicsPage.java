package consumerelectronics;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/23/2017.
 */
public class ConsumerElectronicsPage extends CommonAPI{

    public void consumerElectronicsPageCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCategoriesConsumerElectronicsTab();
    }
}
