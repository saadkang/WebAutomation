package accessories;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class Accessories extends CommonAPI{

    @Test
    public void accessoriesCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Accessories AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        AccessoriesPage accessoriesPage = PageFactory.initElements(driver, AccessoriesPage.class);
        accessoriesPage.AccessoriesPageCategories();
        Thread.sleep(1000);
    }
}
