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

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(6) > div.title > a:nth-child(1)")
    public static WebElement CategoriesBeautyAndPersonalCare;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(6) > div.title > a:nth-child(2)")
    public static WebElement CategoriesHealth;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(7) > div.title > a:nth-child(1)")
    public static WebElement CategoriesPackagingAndPrinting;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(7) > div.title > a:nth-child(2)")
    public static WebElement CategoriesServiceEquipment;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(8) > div.title > a:nth-child(1)")
    public static WebElement CategoriesElecticalEquipment;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(8) > div.title > a:nth-child(2)")
    public static WebElement CategoriesComponents;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(8) > div.title > a:nth-child(3)")
    public static WebElement CategoriesTelecoms;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(9) > div.title > a:nth-child(1)")
    public static WebElement CategoriesSports;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(9) > div.title > a:nth-child(2)")
    public static WebElement CategoriesGifts;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(9) > div.title > a:nth-child(3)")
    public static WebElement CategoriesToys;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(10) > div.title > a:nth-child(1)")
    public static WebElement CategoriesMinerals;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(10) > div.title > a:nth-child(2)")
    public static WebElement CategoriesChemicals;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(10) > div.title > a:nth-child(3)")
    public static WebElement CategoriesPlastics;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(10) > div.title > a:nth-child(4)")
    public static WebElement CategoriesEnergy;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(11) > div.title > a:nth-child(1)")
    public static WebElement CategoriesBags;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(11) > div.title > a:nth-child(2)")
    public static WebElement CategoriesShoesAndAccessories;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(12) > div.title > a:nth-child(1)")
    public static WebElement CategoriesFoodAndBeverages;

    @FindBy(how = How.CSS, using = "#J_SC_header > header > div.sc-hd-row.sc-hd-main > div.sc-hd-cell.sc-hd-category > div > div > div > ul > li:nth-child(12) > div.title > a:nth-child(2)")
    public static WebElement CategoriesAgriculture;


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

    public static WebElement getCategoriesBeautyAndPersonalCare(){
        return CategoriesBeautyAndPersonalCare;
    }

    public static WebElement getCategoriesHealth(){
        return CategoriesHealth;
    }

    public static WebElement getCategoriesPackagingAndPrinting(){
        return CategoriesPackagingAndPrinting;
    }

    public static WebElement getCategoriesServiceEquipment(){
        return CategoriesServiceEquipment;
    }

    public static WebElement getCategoriesElecticalEquipment(){
        return CategoriesElecticalEquipment;
    }

    public static WebElement getCategoriesComponents(){
        return CategoriesComponents;
    }

    public static WebElement getCategoriesTelecoms(){
        return CategoriesTelecoms;
    }

    public static WebElement getCategoriesSports(){
        return CategoriesSports;
    }

    public static WebElement getCategoriesGifts(){
        return CategoriesGifts;
    }

    public static WebElement getCategoriesToys(){
        return CategoriesToys;
    }

    public static WebElement getCategoriesMinerals(){
        return CategoriesMinerals;
    }

    public static WebElement getCategoriesChemicals(){
        return CategoriesChemicals;
    }

    public static WebElement getCategoriesPlastics(){
        return CategoriesPlastics;
    }

    public static WebElement getCategoriesEnergy(){
        return CategoriesEnergy;
    }

    public static WebElement getCategoriesBags(){
        return CategoriesBags;
    }

    public static WebElement getCategoriesShoesAndAccessories(){
        return CategoriesShoesAndAccessories;
    }

    public static WebElement getCategoriesFoodAndBeverages(){
        return CategoriesFoodAndBeverages;
    }

    public static WebElement getCategoriesAgriculture(){
        return CategoriesAgriculture;
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
    public void seeCategoriesBeautyAndPersonalCareOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesBeautyAndPersonalCare().click();
    }
    public void seeCategoriesHealthOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesHealth().click();
    }
    public void seeCategoriesPackagingAndPrintingOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesPackagingAndPrinting().click();
    }
    public void seeCategoriesServiceEquipmentOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesServiceEquipment().click();
    }
    public void seeCategoriesElectricalEquipmentOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesElecticalEquipment().click();
    }
    public void seeCategoriesComponentsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesComponents().click();
    }
    public void seeCategoriesTelecomsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesTelecoms().click();
    }
    public void seeCategoriesSportsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesSports().click();
    }
    public void seeCategoriesGiftsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesGifts().click();
    }
    public void seeCategoriesToysOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesToys().click();
    }
    public void seeCategoriesMineralsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesMinerals().click();
    }
    public void seeCategoriesChemicalsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesChemicals().click();
    }
    public void seeCategoriesPlasticsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesPlastics().click();
    }
    public void seeCategoriesEnergyOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesEnergy().click();
    }
    public void seeCategoriesBagsOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesBags().click();
    }
    public void seeCategoriesShoesAndAccessoriesOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesShoesAndAccessories().click();
    }
    public void seeCategoriesFoodAndBeveragesOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesFoodAndBeverages().click();
    }
    public void seeCategoriesAgricultureOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesAgriculture().click();
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
    public void clickOnCategoriesBeautyAndPersonalCareTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesBeautyAndPersonalCareOptions();
    }
    public void clickOnCategoriesHealthTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesHealthOptions();
    }
    public void clickOnCategoriesPackagingAndPrintingTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesPackagingAndPrintingOptions();
    }
    public void clickOnCategoriesServiceEquipmentTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesServiceEquipmentOptions();
    }
    public void clickOnCategoriesElectricalEquipmentTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesElectricalEquipmentOptions();
    }
    public void clickOnCategoriesComponentsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesComponentsOptions();
    }
    public void clickOnCategoriesTelecomsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesTelecomsOptions();
    }
    public void clickOnCategoriesSportsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesSportsOptions();
    }
    public void clickOnCategoriesGiftsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesGiftsOptions();
    }
    public void clickOnCategoriesToysTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesToysOptions();
    }
    public void clickOnCategoriesMineralsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesMineralsOptions();
    }
    public void clickOnCategoriesChemicalsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesChemicalsOptions();
    }
    public void clickOnCategoriesPlasticsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesPlasticsOptions();
    }
    public void clickOnCategoriesEnergyTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesEnergyOptions();
    }
    public void clickOnCategoriesBagsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesBagsOptions();
    }
    public void clickOnCategoriesShoesAndAccessoriesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesShoesAndAccessoriesOptions();
    }
    public void clickOnCategoriesFoodAndBeveragesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesFoodAndBeveragesOptions();
    }
    public void clickOnCategoriesAgricultureTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCategoriesAgricultureOptions();
    }
}