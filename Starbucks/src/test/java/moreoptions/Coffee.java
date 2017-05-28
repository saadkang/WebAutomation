package moreoptions;

import base.CommonAPI;
import clickontabs.CoffeeTab;
import clickontabs.latte.Latte;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/26/2017.
 */
public class Coffee extends CommonAPI{

    @Test
    public void latte() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Latte AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        CoffeeTab coffeeTab = PageFactory.initElements(driver, CoffeeTab.class);
        coffeeTab.coffee();
        Thread.sleep(2000);
        Latte latte = PageFactory.initElements(driver, Latte.class);
        latte.goToCoffeeLatte();
        latte.goToSkinnyLatte();
    }
}
