package moreoptions;

import base.CommonAPI;
import clickontabs.CoffeeHouseTab;
import clickontabs.design.Design;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/27/2017.
 */
public class CoffeeHouse extends CommonAPI{

    @Test
    public void coffeeHouse() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        CoffeeHouseTab coffeeHouseTab = PageFactory.initElements(driver, CoffeeHouseTab.class);
        coffeeHouseTab.coffeeHouse();
        Design design = PageFactory.initElements(driver, Design.class);
        design.goToStoreDesign();
        design.goToDesignLocation();
    }
}
