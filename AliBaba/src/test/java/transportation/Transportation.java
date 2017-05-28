package transportation;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/23/2017.
 */
public class Transportation extends CommonAPI{

    @Test
    public void transportationCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        Thread.sleep(2000);
        TransportationPage transportationPage = PageFactory.initElements(driver, TransportationPage.class);
        transportationPage.transportationPageCategories();
    }
}
