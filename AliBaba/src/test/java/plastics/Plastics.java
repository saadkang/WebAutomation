package plastics;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class Plastics extends CommonAPI{

    @Test
    public void plasticsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Plastics AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        PlasticsPage plasticsPage = PageFactory.initElements(driver, PlasticsPage.class);
        plasticsPage.plasticsPageCategories();
        Thread.sleep(1000);
    }
}
