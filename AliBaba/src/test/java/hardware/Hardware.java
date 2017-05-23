package hardware;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/15/2017.
 */
public class Hardware extends CommonAPI{

    @Test
    public void hardwareCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Hardware AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        HardwarePage hardwarePage = PageFactory.initElements(driver, HardwarePage.class);
        hardwarePage.hardwarePageCategories();
    }
}
