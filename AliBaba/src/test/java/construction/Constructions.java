package construction;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class Constructions extends CommonAPI{

    @Test
    public void constructionCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Construction AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ConstructionPage constructionPage = PageFactory.initElements(driver, ConstructionPage.class);
        constructionPage.constructionPageCategories();
        Thread.sleep(1000);
    }
}
