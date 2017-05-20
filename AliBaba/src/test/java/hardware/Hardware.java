package hardware;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/15/2017.
 */
public class Hardware extends CommonAPI{

    @Test
    public void hardwareCategories(){
        ApplicationLog.epicLogger("Epic: Hardware AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        HardwarePage hardwarePage = PageFactory.initElements(driver, HardwarePage.class);
        hardwarePage.hardwarePageCategories();
    }
}
