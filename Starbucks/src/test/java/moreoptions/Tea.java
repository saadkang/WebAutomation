package moreoptions;

import base.CommonAPI;
import clickontabs.TeaTab;
import clickontabs.chai.Chai;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/27/2017.
 */
public class Tea extends CommonAPI{

    @Test
    public void chai() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: ChaiTea AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        TeaTab teaTab = PageFactory.initElements(driver, TeaTab.class);
        teaTab.tea();
        Chai chai = PageFactory.initElements(driver, Chai.class);
        chai.clickOnChaiTea();
        chai.clickOnMaharajaChai();

    }
}
