package shoesandaccessories;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class ShoesAndAccessories extends CommonAPI{

    @Test
    public void shoesAndAccessoriesCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: ShoesAndAccessories AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ShoesAndAccessoriesPage shoesAndAccessoriesPage = PageFactory.initElements(driver, ShoesAndAccessoriesPage.class);
        shoesAndAccessoriesPage.shoesAndAccessoriesPageCategories();
        Thread.sleep(1000);
    }
}
