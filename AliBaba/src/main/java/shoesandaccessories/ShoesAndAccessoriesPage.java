package shoesandaccessories;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/24/2017.
 */
public class ShoesAndAccessoriesPage extends CommonAPI{

    public void shoesAndAccessoriesPageCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCategoriesShoesAndAccessoriesTab();
    }
}
