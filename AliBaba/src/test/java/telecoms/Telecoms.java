package telecoms;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class Telecoms extends CommonAPI{

    @Test
    public void telecomsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Telecoms AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        Thread.sleep(2000);
        TelecomsPage telecomsPage = PageFactory.initElements(driver, TelecomsPage.class);
        telecomsPage.telecomsPageCategories();
    }
}
