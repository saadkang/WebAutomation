package clickontabs;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/22/2017.
 */
public class BlogTab extends CommonAPI{

    @Test
    public void blog() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: BlogTab AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ClickOnTabs clickOnTabs = PageFactory.initElements(driver, ClickOnTabs.class);
        clickOnTabs.clickOnBlogTab();
        Thread.sleep(2000);
    }
}
