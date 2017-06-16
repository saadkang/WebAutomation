package brand;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by saadi on 6/15/2017.
 */
public class Brand extends CommonAPI{

    @Test
    public void brandPage(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToBrand();
    }
}
