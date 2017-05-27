package clickontabs.chai;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/27/2017.
 */
public class Chai extends CommonAPI{

    @FindBy(how = How.CSS, using = "#menu_menudrinkstea div:nth-child(1) ol:nth-child(1) li:nth-child(3) ol:nth-child(2) li:nth-child(5) a:nth-child(1)")
    public static WebElement chaiTea;

    @FindBy(how = How.CSS, using = ".product_card:nth-child(8) div:nth-child(2) a:nth-child(2)")
    public static WebElement maharajaChai;

    public static WebElement getChaiTea() {
        return chaiTea;
    }

    public static WebElement getMaharajaChai() {
        return maharajaChai;
    }
    public void clickOnChaiTea(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getChaiTea().click();
    }
    public void clickOnMaharajaChai(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMaharajaChai().click();
    }
    public void goToChaiTea(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnChaiTea();
    }
    public void goToMaharajaChai(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnMaharajaChai();
    }
}
