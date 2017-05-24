package electricalequipment;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class ElectricalEquipment extends CommonAPI{

    @Test
    public void electricalEquipmentCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ElectricalEquipmentPage electricalEquipmentPage = PageFactory.initElements(driver, ElectricalEquipmentPage.class);
        electricalEquipmentPage.electricalEquipmentPageCategories();
        Thread.sleep(1000);
    }
}
