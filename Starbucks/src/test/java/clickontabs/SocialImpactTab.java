package clickontabs;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/22/2017.
 */
public class SocialImpactTab extends CommonAPI{

    @Test
    public void socialImpact() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: SocialImpactTab AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ClickOnTabs clickOnTabs = PageFactory.initElements(driver, ClickOnTabs.class);
        clickOnTabs.clickOnSocialImpactTab();
        Thread.sleep(2000);
    }
}
