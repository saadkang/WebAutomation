package lights;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class Lights extends CommonAPI{

    @Test
    public void lightsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        LightsPage lightsPage = PageFactory.initElements(driver, LightsPage.class);
        lightsPage.lightsPageCategories();
        Thread.sleep(1000);
    }
}