package sports;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class Sports extends CommonAPI{

    @Test
    public void sportsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Sports AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        SportsPage sportsPage = PageFactory.initElements(driver, SportsPage.class);
        sportsPage.sportsPageCategories();
        Thread.sleep(1000);
    }
}