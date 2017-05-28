package moreoptions;

import base.CommonAPI;
import clickontabs.SocialImpactTab;
import clickontabs.menugoods.MenuGoods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/27/2017.
 */
public class SocialImpact extends CommonAPI{

    @Test
    public void social() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SocialImpactTab socialImpactTab = PageFactory.initElements(driver, SocialImpactTab.class);
        socialImpactTab.socialImpact();
        Thread.sleep(2000);
        MenuGoods menuGoods = PageFactory.initElements(driver, MenuGoods.class);
        menuGoods.clickOnMenuGoodiess();
        Thread.sleep(2000);
        menuGoods.clickOnTheirGoal();
    }
}
