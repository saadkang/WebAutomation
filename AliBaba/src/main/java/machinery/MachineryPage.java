package machinery;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/14/2017.
 */
public class MachineryPage extends CommonAPI{

    public void machineryPageCategories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Thread.sleep(3000);
        homePage.clickOnCategoriesTab();
        Thread.sleep(3000);
        homePage.clickOnCategoriesMachineryTab();
    }
}
