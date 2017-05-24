package toys;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class Toys extends CommonAPI{

    @Test
    public void toysCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Toys AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ToysPage toysPage = PageFactory.initElements(driver, ToysPage.class);
        toysPage.toysPageCategories();
        Thread.sleep(1000);
    }
}
