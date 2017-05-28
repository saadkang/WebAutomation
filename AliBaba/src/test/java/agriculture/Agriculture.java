package agriculture;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class Agriculture extends CommonAPI{

    @Test
    public void agricultureCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Agriculture AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        Thread.sleep(2000);
        AgriculturePage agriculturePage = PageFactory.initElements(driver, AgriculturePage.class);
        agriculturePage.agriculturePageCategories();

    }
}
