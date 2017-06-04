package account;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 6/4/2017.
 */
public class Account extends CommonAPI{

    @Test
    public void account(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToAccount();
    }
}
