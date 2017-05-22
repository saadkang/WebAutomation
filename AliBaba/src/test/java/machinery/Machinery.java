package machinery;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/14/2017.
 */
public class Machinery extends CommonAPI{

    @Test
    public void machineryCategories(){
        ApplicationLog.epicLogger("Epic: Machinery AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        MachineryPage machineryPage = PageFactory.initElements(driver, MachineryPage.class);
        machineryPage.machineryPageCategories();
    }
}
