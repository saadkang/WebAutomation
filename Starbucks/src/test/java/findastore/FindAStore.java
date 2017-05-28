package findastore;

import base.CommonAPI;
import findingstore.FindingStarbucks;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/25/2017.
 */
public class FindAStore extends CommonAPI{

    @Test
    public void findStorePage() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: FindAStore AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        FindingStarbucks findingStarbucks = PageFactory.initElements(driver, FindingStarbucks.class);
        findingStarbucks.goToFindStore();
        Thread.sleep(1000);
        findingStarbucks.typeZipCode();
        Thread.sleep(2000);
    }
}
