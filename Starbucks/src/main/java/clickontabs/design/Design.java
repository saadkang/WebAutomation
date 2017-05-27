package clickontabs.design;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/27/2017.
 */
public class Design extends CommonAPI{

    @FindBy(how = How.CSS, using = "#menu_coffeehouse div:nth-child(1) ol:nth-child(1) li:nth-child(4) p:nth-child(1) a:nth-child(1)")
    public static WebElement storeDesign;

    @FindBy(how = How.CSS, using = ".blocks:nth-child(8) li:nth-child(7) a:nth-child(1) dl:nth-child(1) dd:nth-child(2) span:nth-child(1)")
    public static WebElement designLocation;

    public static WebElement getStoreDesign() {
        return storeDesign;
    }

    public static WebElement getDesignLocation() {
        return designLocation;
    }
    public void clickOnStoreDesign(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStoreDesign().click();
    }
    public void clickOnDesignLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDesignLocation().click();
    }
    public void goToStoreDesign(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnStoreDesign();
    }
    public void goToDesignLocation(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnDesignLocation();
    }
}
