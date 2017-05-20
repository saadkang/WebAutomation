package groundcoffee;

import base.CommonAPI;
import groundcoffeethingy.GroundCoffeePage;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/17/2017.
 */
public class GroundCoffee extends CommonAPI{

    @Test(enabled = false)
    public void ground(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        GroundCoffeePage groundCoffeePage = PageFactory.initElements(driver, GroundCoffeePage.class);
        groundCoffeePage.groundCoffeeLaunch();
    }
}