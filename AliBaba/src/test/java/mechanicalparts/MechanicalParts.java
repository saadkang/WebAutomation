package mechanicalparts;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/14/2017.
 */
public class MechanicalParts extends CommonAPI{

    @Test
    public void mechanicalPartsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Mechanical Parts AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        Thread.sleep(2000);
        MechanicalPartsPage mechanicalPartsPage = PageFactory.initElements(driver, MechanicalPartsPage.class);
        mechanicalPartsPage.mechanicalPartsPageCategories();
    }
}
