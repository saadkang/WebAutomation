package findastore;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 6/6/2017.
 */
public class Store extends CommonAPI{

    @Test
    public void storePage(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnFindAStore();
    }
}
