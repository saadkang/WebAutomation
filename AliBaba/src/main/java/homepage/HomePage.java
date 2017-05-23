package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/14/2017.
 */
public class HomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = ".sc-hd-prefix2-icon-xs")
    public static WebElement Categories;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(1) > div.title > a:nth-child(1)")
    public static WebElement CategoriesMachinery;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(1) > div.title > a:nth-child(2)")
    public static WebElement CategoriesMechanicalParts;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(1) > div.title > a:nth-child(3)")
    public static WebElement CategoriesTools;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(1) > div.title > a:nth-child(4)")
    public static WebElement CategoriesHardware;

    public static WebElement getSectionsCategories() {
        return Categories;
    }

    public static WebElement getCategoriesMachinery() {
        return CategoriesMachinery;
    }

    public static WebElement getCategoriesMechanicalParts(){
        return CategoriesMechanicalParts;
    }

    public static WebElement getCategoriesTools(){
        return CategoriesTools;
    }

    public static WebElement getCategoriesHardware(){
        return CategoriesHardware;
    }

    public void seeCategoriesOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsCategories().click();
    }
    public void seeCategoriesMachineryOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesMachinery().click();
    }
    public void seeCategoriesMechanicalPartsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesMechanicalParts().click();
    }
    public void seeCategoriesToolsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesTools().click();
    }
    public void seeCategoriesHardwareOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesHardware().click();
    }
    public void clickOnCategoriesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesOptions();
    }
    public void clickOnCategoriesMachineryTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesMachineryOptions();
    }
    public void clickOnCategoriesMechanicalPartsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesMechanicalPartsOptions();
    }
    public void clickOnCategoriesToolsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesToolsOptions();
    }
    public void clickOnCategoriesHardwareTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesHardwareOptions();
    }
}
