package products;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by saadi on 6/14/2017.
 */
public class Products extends CommonAPI{

    @Test
    public void productPage() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToProducts();
        Thread.sleep(3000);
    }
}
