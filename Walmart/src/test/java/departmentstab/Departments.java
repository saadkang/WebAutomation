package departmentstab;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 6/6/2017.
 */
public class Departments extends CommonAPI{

    @Test
    public void departmentsPage() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDepartments();
        homePage.clickOnElectronicsAndOffice();
        homePage.clickOniPad();
        Thread.sleep(3000);
    }
}
