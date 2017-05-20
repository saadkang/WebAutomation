package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by saadi on 5/17/2017.
 */
public class HomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = "a.mitem ")
    public static WebElement worldCup;

    public static WebElement getWorldCup() {
        return worldCup;
    }
    public void clickOnWorldCup(){
        getWorldCup().click();
    }
}
