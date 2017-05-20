package mechanicalparts;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/14/2017.
 */
public class MechanicalParts extends CommonAPI{

    @Test
    public void mechanicalPartsCategories(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        MechanicalPartsPage mechanicalPartsPage = PageFactory.initElements(driver, MechanicalPartsPage.class);
        mechanicalPartsPage.mechanicalPartsPageCategories();
    }
}
