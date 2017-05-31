package flyfishingreels;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/31/2017.
 */
public class FlyFishingReels extends CommonAPI{

    @Test
    public void flyFishPage(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        FlyFishingReelsPage flyFishingReelsPage = PageFactory.initElements(driver, FlyFishingReelsPage.class);
        flyFishingReelsPage.flyReel();
    }
}
