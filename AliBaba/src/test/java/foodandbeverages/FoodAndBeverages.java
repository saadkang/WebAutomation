package foodandbeverages;

import base.CommonAPI;
import categories.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/24/2017.
 */
public class FoodAndBeverages extends CommonAPI{

    @Test
    public void foodAndBeveragesCategories() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Categories categories = PageFactory.initElements(driver, Categories.class);
        categories.categories();
        FoodAndBeveragesPage foodAndBeveragesPage = PageFactory.initElements(driver, FoodAndBeveragesPage.class);
        foodAndBeveragesPage.foodAndBeveragesPageCategories();
        Thread.sleep(1000);
    }
}