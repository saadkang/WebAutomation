package chemicals;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class Chemicals extends CommonAPI{

    @Test
    public void chemicalsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ChemicalsPage chemicalsPage = PageFactory.initElements(driver, ChemicalsPage.class);
        chemicalsPage.chemicalsPageCategories();
        Thread.sleep(1000);
    }
}
