package worldcup;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by saadi on 5/17/2017.
 */
public class WorldCupPage extends CommonAPI{

    @Test(enabled = false)
    public void goToWorldCupPage(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWorldCup();
    }
    @Test
    public void goToHotTrends(){
        clickByCss("categories-head a.mitem div:nth-child(2)");
    }
}
