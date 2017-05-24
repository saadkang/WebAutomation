package auto;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class Auto extends CommonAPI{

    @Test
    public void autoCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Auto AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        AutoPage autoPage = PageFactory.initElements(driver, AutoPage.class);
        autoPage.autoPageCategories();
        Thread.sleep(1000);
    }
}
