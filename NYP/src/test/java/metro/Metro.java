package metro;

import base.CommonAPI;
import log.NYPLog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class Metro extends CommonAPI {

    @Test
    public void metroNews(){
        NYPLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        MetroPage metroPage = PageFactory.initElements(driver, MetroPage.class);
        metroPage.metroPageNews();
    }
}
