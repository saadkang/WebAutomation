package clickontabs.frapp;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/27/2017.
 */
public class Frapp extends CommonAPI{

    @FindBy(how = How.CSS, using = "#menu_menu div:nth-child(1) ol:nth-child(1) li:nth-child(1) ol:nth-child(2) li:nth-child(7) a:nth-child(1)")
    public static WebElement menuFrapp;

    @FindBy(how = How.CSS, using = ".blocks:nth-child(4) li:nth-child(25) a:nth-child(1) dl:nth-child(1) dd:nth-child(2) strong:nth-child(1) span:nth-child(1)")
    public static WebElement smoreFrapp;

    public static WebElement getMenuFrapp() {
        return menuFrapp;
    }

    public static WebElement getSmoreFrapp() {
        return smoreFrapp;
    }
    public void clickOnFrappBlend(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenuFrapp().click();
    }
    public void clickOnSmoreFrapp(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSmoreFrapp().click();
    }
    public void goToFrappBlend(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnFrappBlend();
    }
    public void goToSmoreFrapp(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSmoreFrapp();
    }
}
