package furniture;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class Furniture extends CommonAPI{

    @Test
    public void furnitureCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Furniture AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        furniturePage.furniturePageCategories();
        Thread.sleep(1000);
    }
}
