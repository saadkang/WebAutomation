package kcuppod;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/17/2017.
 */
public class KcupPod extends CommonAPI{

    @Test(enabled = false)
    public void kcup(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        KcupPodPage kcupPodPage = PageFactory.initElements(driver, KcupPodPage.class);
        kcupPodPage.kCupPodLaunch();
    }
}
