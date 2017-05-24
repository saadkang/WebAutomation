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

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(2) > div.title > a:nth-child(1)")
    public static WebElement CategoriesConsumerElectronics;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(2) > div.title > a:nth-child(2)")
    public static WebElement CategoriesHomeAppliances;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(2) > div.title > a:nth-child(3)")
    public static WebElement CategoriesSecurity;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(3) > div.title > a:nth-child(1)")
    public static WebElement CategoriesAuto;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(3) > div.title > a:nth-child(2)")
    public static WebElement CategoriesTransportation;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(4) > div.title > a:nth-child(1)")
    public static WebElement CategoriesApparel;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(4) > div.title > a:nth-child(2)")
    public static WebElement CategoriesTextiles;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(4) > div.title > a:nth-child(3)")
    public static WebElement CategoriesTimepieces;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(4) > div.title > a:nth-child(4)")
    public static WebElement CategoriesAccessories;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(5) > div.title > a:nth-child(1)")
    public static WebElement CategoriesHomeAndGarden;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(5) > div.title > a:nth-child(2)")
    public static WebElement CategoriesConstruction;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(5) > div.title > a:nth-child(3)")
    public static WebElement CategoriesLights;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(5) > div.title > a:nth-child(4)")
    public static WebElement CategoriesFurniture;


    public static WebElement getCategories() {
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

    public static WebElement getCategoriesConsumerElectronics(){
        return CategoriesConsumerElectronics;
    }

    public static WebElement getCategoriesHomeAppliances(){
        return CategoriesHomeAppliances;
    }

    public static WebElement getCategoriesSecurity(){
        return CategoriesSecurity;
    }

    public static WebElement getCategoriesAuto(){
        return CategoriesAuto;
    }

    public static WebElement getCategoriesTransportation(){
        return CategoriesTransportation;
    }

    public static WebElement getCategoriesApparel(){
        return CategoriesApparel;
    }

    public static WebElement getCategoriesTextiles(){
        return CategoriesTextiles;
    }

    public static WebElement getCategoriesTimepieces(){
        return CategoriesTimepieces;
    }

    public static WebElement getCategoriesAccessories(){
        return CategoriesAccessories;
    }

    public static WebElement getCategoriesHomeAndGarden(){
        return CategoriesHomeAndGarden;
    }

    public static WebElement getCategoriesConstruction(){
        return CategoriesConstruction;
    }

    public static WebElement getCategoriesLights(){
        return CategoriesLights;
    }

    public static WebElement getCategoriesFurniture(){
        return CategoriesFurniture;
    }

    public void seeCategoriesOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategories().click();
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
    public void seeCategoriesConsumerElectronicsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesConsumerElectronics().click();
    }
    public void seeCategoriesHomeAppliancesOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesHomeAppliances().click();
    }
    public void seeCategoriesSecurityOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesSecurity().click();
    }
    public void seeCategoriesAutoOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesAuto().click();
    }
    public void seeCategoriesTransportationOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesTransportation().click();
    }
    public void seeCategoriesApparelOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesApparel().click();
    }
    public void seeCategoriesTextileOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesTextiles().click();
    }
    public void seeCategoriesTimepieceOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesTimepieces().click();
    }
    public void seeCategoriesAccessoriesOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesAccessories().click();
    }
    public void seeCategoriesHomeAndGardenOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesHomeAndGarden().click();
    }
    public void seeCategoriesConstructionOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesConstruction().click();
    }
    public void seeCategoriesLightsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesLights().click();
    }
    public void seeCategoriesFurnitureOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesFurniture().click();
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
    public void clickOnCategoriesConsumerElectronicsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesConsumerElectronicsOptions();
    }
    public void clickOnCategoriesHomeAppliancesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesHomeAppliancesOptions();
    }
    public void clickOnCatergoriesSecutityTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesSecurityOptions();
    }
    public void clickOnCategoriesAutoTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesAutoOptions();
    }
    public void clickOnCategoriesTransportationTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesTransportationOptions();
    }
    public void clickOnCategoriesApparelTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesApparelOptions();
    }
    public void clickOnCategoriesTextileTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesTextileOptions();
    }
    public void clickOnCategoriesTimepieceTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesTimepieceOptions();
    }
    public void clickOnCategoriesAccessoriesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesAccessoriesOptions();
    }
    public void clickOnCategoriesHomeAndGardenTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesHomeAndGardenOptions();
    }
    public void clickOnCategoriesConstructionTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesConstructionOptions();
    }
    public void clickOnCategoriesLightsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesLightsOptions();
    }
    public void clickOnCategoriesFurnitureTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesFurnitureOptions();
    }
}