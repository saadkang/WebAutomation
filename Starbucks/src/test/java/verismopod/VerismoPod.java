package verismopod;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/17/2017.
 */
public class VerismoPod extends CommonAPI{

    @Test(enabled = false)
    public void verismo(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        VerismoPodPage verismoPodPage = PageFactory.initElements(driver, VerismoPodPage.class);
        verismoPodPage.verismoPodLaunch();
    }
}
