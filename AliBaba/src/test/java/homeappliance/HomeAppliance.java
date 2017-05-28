package homeappliance;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class HomeAppliance extends CommonAPI{

    @Test
    public void homeApplianceCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: HomeAppliance AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        Thread.sleep(2000);
        HomeAppliancesPage homeAppliancesPage = PageFactory.initElements(driver, HomeAppliancesPage.class);
        homeAppliancesPage.homeAppliancesPageCategories();
    }
}
