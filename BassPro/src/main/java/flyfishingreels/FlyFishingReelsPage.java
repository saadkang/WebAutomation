package flyfishingreels;

import base.CommonAPI;
import homepage.UpperTabs;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/31/2017.
 */
public class FlyFishingReelsPage extends CommonAPI{

    public void flyReel(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        UpperTabs upperTabs = PageFactory.initElements(driver, UpperTabs.class);
        upperTabs.goToFishing();
        upperTabs.goToFlyFishingReels();
    }
}
