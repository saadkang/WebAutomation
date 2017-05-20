package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/16/2017.
 */
public class HomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_coffee a.tab strong:nth-child(1)")
    public static WebElement Coffee;

    @FindBy(how = How.CSS, using = "#nav .nav_menu li#nav_coffee a.tab strong:nth-child(1)")
    public static WebElement ourCoffee;

    @FindBy(how = How.CSS, using = "#nav .nav_menu li#nav_coffee a.tab strong:nth-child(2)")
    public static WebElement wholeBeanCoffee;

    @FindBy(how = How.CSS, using = "#nav .nav_menu li#nav_coffee a.tab strong:nth-child(3)")
    public static WebElement groundCoffee;

    @FindBy(how = How.CSS, using = "#nav .nav_menu li#nav_coffee a.tab strong:nth-child(4)")
    public static WebElement verismoPod;

    @FindBy(how = How.CSS, using = "#nav .nav_menu li#nav_coffee a.tab strong:nth-child(5)")
    public static WebElement kCupPod;

    public static WebElement getCoffee(){
        return Coffee;
    }
    public static WebElement getOurCoffee() {
        return ourCoffee;
    }
    public static WebElement getWholeBeanCoffee(){
        return wholeBeanCoffee;
    }
    public static WebElement getGroundCoffee(){
        return groundCoffee;
    }
    public static WebElement getVerismoPod(){
        return verismoPod;
    }
    public static WebElement getkCupPod(){
        return kCupPod;
    }

    public void hoverOverCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCoffee();
    }
    public void clickOnOurCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverOverCoffee();
        getOurCoffee().click();
    }
    public void clickOnWholeBeanCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverOverCoffee();
        getWholeBeanCoffee().click();
    }
    public void clickOnGroundCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverOverCoffee();
        getGroundCoffee().click();
    }
    public void clickOnVerismoPod(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverOverCoffee();
        getVerismoPod().click();
    }
    public void clickOnKcupPod(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverOverCoffee();
        getkCupPod().click();
    }
    public void goToOurCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnOurCoffee();
    }
    public void goToWholeBeanCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnWholeBeanCoffee();
    }
    public void goToGroundCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnGroundCoffee();
    }
    public void goToVerismoPod(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnVerismoPod();
    }
    public void goToKcupPod(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnKcupPod();
    }
}
