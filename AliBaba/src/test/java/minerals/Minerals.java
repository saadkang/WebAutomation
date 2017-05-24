package minerals;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

import java.net.CacheRequest;

/**
 * Created by saadi on 5/24/2017.
 */
public class Minerals extends CommonAPI{

    @Test
    public void mineralsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Minerals AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        MineralsPage mineralsPage = PageFactory.initElements(driver, MineralsPage.class);
        mineralsPage.mineralsPageCategories();
        Thread.sleep(1000);
    }
}
