package health;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class Health extends CommonAPI{

    @Test
    public void healthCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Health AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        Thread.sleep(2000);
        HealthPage healthPage = PageFactory.initElements(driver, HealthPage.class);
        healthPage.healthPageCategories();
    }
}
