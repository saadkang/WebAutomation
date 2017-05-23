import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/22/2017.
 */
public class Categories extends CommonAPI{

    @Test
    public void categories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Categories AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.categories();
        Thread.sleep(3000);
    }
}
