package packagingandprinting;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class PackagingAndPrinting extends CommonAPI{

    @Test
    public void packagingAndPrintingCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: PackagingAndPrinting AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        PackagingAndPrintingPage packagingAndPrintingPage = PageFactory.initElements(driver, PackagingAndPrintingPage.class);
        packagingAndPrintingPage.packagingAndPrintingPageCategories();
        Thread.sleep(1000);
    }
}
