package apparel;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class Apparel extends CommonAPI{

    @Test
    public void apparelCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Apparel AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ApparelPage apparelPage = PageFactory.initElements(driver, ApparelPage.class);
        apparelPage.apparelPageCategories();
        Thread.sleep(1000);
    }
}
