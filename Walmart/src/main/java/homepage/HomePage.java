package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 6/6/2017.
 */
public class HomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = "#header-GlobalLefthandNav-toggle-1")
    public static WebElement Departments;

    @FindBy(how = How.CSS, using = "#superDeptId-0")
    public static WebElement ElectronicesAndOffice;

    @FindBy(how = How.CSS, using = "#superDept-0 > div:nth-child(3) > div:nth-child(1) > a:nth-child(2)")
    public static WebElement iPad;

    @FindBy(how = How.CSS, using = "#header-GlobalEyebrowNav-button-3")
    public static WebElement FindAStore;

    public static WebElement getDepartments() {
        return Departments;
    }

    public static WebElement getElectronicesAndOffice() {
        return ElectronicesAndOffice;
    }

    public static WebElement getiPad() {
        return iPad;
    }

    public static WebElement getFindAStore() {
        return FindAStore;
    }
    public void goToDepartments(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDepartments().click();
    }
    public void viewElectronicsAndOfficeOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getElectronicesAndOffice().click();
    }
    public void viewIpadPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getiPad().click();
    }
    public void viewStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFindAStore().click();
    }
    public void clickOnDepartments(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToDepartments();
    }
    public void clickOnElectronicsAndOffice(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewElectronicsAndOfficeOptions();
    }
    public void clickOnIpad(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewIpadPage();
    }
    public void clickOnFindAStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewStore();
    }
}
