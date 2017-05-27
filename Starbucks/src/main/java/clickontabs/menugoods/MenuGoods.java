package clickontabs.menugoods;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/27/2017.
 */
public class MenuGoods extends CommonAPI{

    @FindBy(how = How.CSS, using = "#menu_responsibility div:nth-child(1) ol:nth-child(1) li:nth-child(2) ol:nth-child(2) li:nth-child(5) a:nth-child(1)")
    public static WebElement MenuGoodiess;

    @FindBy(how = How.CSS, using = ".section_navigation ul:nth-child(2) li:nth-child(3) a:nth-child(1)")
    public static WebElement TheirGoal;

    public static WebElement getMenuGoodiess() {
        return MenuGoodiess;
    }

    public static WebElement getTheirGoal() {
        return TheirGoal;
    }
    public void clickOnMenuGoodiess(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenuGoodiess().click();
    }
    public void clickOnTheirGoal(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTheirGoal().click();
    }
    public void goToMenuGoodiess(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnMenuGoodiess();
    }
    public void goToTheirGoal(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTheirGoal();
    }
}
