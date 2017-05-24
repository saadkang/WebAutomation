package serviceequipment;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class ServiceEquipment extends CommonAPI{

    @Test
    public void serviceEquipmentCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: ServiceEquipment AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        ServiceEquipmentPage serviceEquipmentPage = PageFactory.initElements(driver, ServiceEquipmentPage.class);
        serviceEquipmentPage.serviceEquipmentPageCategories();
        Thread.sleep(1000);
    }
}
