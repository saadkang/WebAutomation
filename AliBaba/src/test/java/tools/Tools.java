package tools;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/14/2017.
 */
public class Tools extends CommonAPI{

    @Test
    public void toolsCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Tools AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ToolsPage toolsPage = PageFactory.initElements(driver, ToolsPage.class);
        toolsPage.toolsPageCategories();
    }
}
