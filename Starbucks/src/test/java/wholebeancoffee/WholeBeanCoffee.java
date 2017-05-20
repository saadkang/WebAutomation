package wholebeancoffee;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/17/2017.
 */
public class WholeBeanCoffee extends CommonAPI{

    @Test(enabled = false)
    public void whole(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        WholeBeanCoffeePage wholeBeanCoffeePage = PageFactory.initElements(driver, WholeBeanCoffeePage.class);
        wholeBeanCoffeePage.wholeBeanCoffeeLaunch();
    }
}
