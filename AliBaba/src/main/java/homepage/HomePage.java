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

    @FindBy(how = How.CSS, using = ".header-category-wrapper .header-category .component-list li:nth-child(1)>a")
    public static WebElement sectionsCategories;

    @FindBy(how = How.CSS, using = ".header-category .component-list li:nth-child(1)>a")
    public static WebElement sectionsCategoriesMachinery;

    @FindBy(how = How.CSS, using = ".header-category .component-list li:nth-child(2)>a")
    public static WebElement sectionsCategoriesMechanicalParts;

    @FindBy(how = How.CSS, using = ".header-category li:nth-child(3)")
    public static WebElement sectionsCategoriesTools;

    @FindBy(how = How.CSS, using = ".header-category li:nth-child(4)")
    public static WebElement sectionsCategoriesHardware;

    public static WebElement getSectionsCategories() {
        return sectionsCategories;
    }

    public static WebElement getSectionsCategoriesMachinery() {
        return sectionsCategoriesMachinery;
    }

    public static WebElement getSectionsCategoriesMechanicalParts() {
        return sectionsCategoriesMechanicalParts;
    }

    public static WebElement getSectionsCategoriesTools() {
        return sectionsCategoriesTools;
    }

    public static WebElement getSectionsCategoriesHardware() {
        return sectionsCategoriesHardware;
    }

    public void clickOnSectionsCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS(".header-category-wrapper  .header-category-trigger .sc-hd-prefix2-icon-xs");
        clickByCss(".header-category-wrapper  .header-category-trigger .sc-hd-prefix2-icon-xs");
    }
    public void clickOnSectionsCategoriesMachinery(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSectionsCategories();
        getSectionsCategoriesMachinery().click();
    }
    public void clickOnSectionsCategoriesMechanicalParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsCategoriesMechanicalParts().click();
    }
    public void clickOnSectionsCategoriesTools(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsCategoriesTools().click();
    }
    public void clickOnSectionsCategoriesHardware(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsCategoriesHardware().click();
    }
    public void goToSectionsCategories(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSectionsCategories();
    }
    public void goToSectionsCategoriesMachinery(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToSectionsCategories();
        clickOnSectionsCategoriesMachinery();
    }
    public void goToSectionsCategoriesMechanicalParts(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToSectionsCategories();
        clickOnSectionsCategoriesMechanicalParts();
    }
    public void goToSectionsCategoriesTools(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToSectionsCategories();
        clickOnSectionsCategoriesTools();
    }
    public void goToSectionsCategoriesHardware(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToSectionsCategories();
        clickOnSectionsCategoriesHardware();
    }
}
