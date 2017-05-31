package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/30/2017.
 */
public class UpperTabs extends CommonAPI{

//----------Below are the Selectors for Upper Tab---------------------------
    @FindBy(how = How.CSS, using = "#tab1 a:nth-child(1)")
    public static WebElement Shop;

    @FindBy(how = How.CSS, using = "#tab2 a:nth-child(1)")
    public static WebElement NewsAndTips;

    @FindBy(how = How.CSS, using = "#tab3 a:nth-child(1)")
    public static WebElement Stores;

    @FindBy(how = How.CSS, using = "#tab4 a:nth-child(1)")
    public static WebElement BoatsAndATVs;

    @FindBy(how = How.CSS, using = "#tab5 a:nth-child(1)")
    public static WebElement BigCedarLodge;

//-----------Below are the Sub-Tabs for the Shop Tabs-------------------------
    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(1)")
    public static WebElement Fishing;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(2)")
    public static WebElement Boating;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(3)")
    public static WebElement Hunting;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(4)")
    public static WebElement Shooting;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(5)")
    public static WebElement HuntingClothes;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(6)")
    public static WebElement Camping;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(7)")
    public static WebElement Clothing;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(8)")
    public static WebElement ShoesAndBoats;

    @FindBy(how = How.CSS, using = "#tab1-nav > li:nth-child(9)")
    public static WebElement HomeAndGifts;

//-----------Below are the Selector for Sub-tab Fishing---------------------
    @FindBy(how = How.CSS, using = "#contentRecommendationWidget_tab1_dept1_espot1 div:nth-child(3) h3:nth-child(1) a:nth-child(1)")
    public static WebElement FishingReels;

    @FindBy(how = How.CSS, using = "#contentRecommendationWidget_tab1_dept1_espot1 div:nth-child(3) ul:nth-child(2) li:nth-child(1)")
    public static WebElement BaitcastReels;

    @FindBy(how = How.CSS, using = "#contentRecommendationWidget_tab1_dept1_espot1 div:nth-child(3) ul:nth-child(2) li:nth-child(2)")
    public static WebElement SpinningReels;

    @FindBy(how = How.CSS, using = "#contentRecommendationWidget_tab1_dept1_espot1 div:nth-child(3) ul:nth-child(2) li:nth-child(3)")
    public static WebElement SpincastReels;

    @FindBy(how = How.CSS, using = "#contentRecommendationWidget_tab1_dept1_espot1 div:nth-child(3) ul:nth-child(2) li:nth-child(4)")
    public static WebElement SaltwaterReels;

    @FindBy(how = How.CSS, using = "#contentRecommendationWidget_tab1_dept1_espot1 div:nth-child(3) ul:nth-child(2) li:nth-child(5)")
    public static WebElement FlyFishingReels;

    //-----------Below are the Getter methods for Upper Tabs---------------------
    public static WebElement getShop() {
        return Shop;
    }

    public static WebElement getNewsAndTips() {
        return NewsAndTips;
    }

    public static WebElement getStores() {
        return Stores;
    }

    public static WebElement getBoatsAndATVs() {
        return BoatsAndATVs;
    }

    public static WebElement getBigCedarLodge() {
        return BigCedarLodge;
    }

//------------Below are the Getter methods for Shop Tab-----------------------
    public static WebElement getFishing() {
        return Fishing;
    }

    public static WebElement getBoating() {
        return Boating;
    }

    public static WebElement getHunting() {
        return Hunting;
    }

    public static WebElement getShooting() {
        return Shooting;
    }

    public static WebElement getHuntingClothes() {
        return HuntingClothes;
    }

    public static WebElement getCamping() {
        return Camping;
    }

    public static WebElement getClothing() {
        return Clothing;
    }

    public static WebElement getShoesAndBoats() {
        return ShoesAndBoats;
    }

    public static WebElement getHomeAndGifts() {
        return HomeAndGifts;
    }

//---------------Below are the Getter methods for Sub-Tab Fishing--------------------
    public static WebElement getFishingReels() {
        return FishingReels;
    }

    public static WebElement getBaitcastReels() {
        return BaitcastReels;
    }

    public static WebElement getSpinningReels() {
        return SpinningReels;
    }

    public static WebElement getSpincastReels() {
        return SpincastReels;
    }

    public static WebElement getSaltwaterReels() {
        return SaltwaterReels;
    }

    public static WebElement getFlyFishingReels() {
        return FlyFishingReels;
    }

    //---------------Below are the clickOn methods for Upper Tabs------------------------
    public void clickOnShopTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShop().click();
    }
    public void clickOnNewAndTipsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getNewsAndTips().click();
    }
    public void clickOnStoresTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStores().click();
    }
    public void clickOnBoatsAndATVsTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBoatsAndATVs().click();
    }
    public void clickOnBigCedarLodgeTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBigCedarLodge().click();
    }
//-----------Below are the click On methods for sub-tab shop----------------------
    public void clickOnFishingTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFishing().click();
    }
    public void clickOnBoating(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBoating().click();
    }
    public void clickOnHunting(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHunting().click();
    }
    public void clickOnShooting(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShooting().click();
    }
    public void clickOnHuntingClothes(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHuntingClothes().click();
    }
    public void clickOnCamping(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCamping().click();
    }
    public void clickOnClothing(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClothing().click();
    }
    public void clickOnShoesAndBoats(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShoesAndBoats().click();
    }
    public void clickOnHomeAndGifts(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHomeAndGifts().click();
    }
//-------------Below are the clickOn methods for Sub-Tab Fishing------------------
    public void clickOnFishingReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFishingReels().click();
    }
    public void clickOnBaitcastReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBaitcastReels().click();
    }
    public void clickOnSpinningReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSpinningReels().click();
    }
    public void clickOnSpincastReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSpincastReels().click();
    }
    public void clickOnSaltwaterReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSaltwaterReels().click();
    }
    public void clickOnFlyFishingReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFlyFishingReels().click();
    }
//-------------Below are the goTo methods for Upper Tabs--------------------------
    public void goToShop(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnShopTab();
    }
    public void goToNewsAndTips(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNewAndTipsTab();
    }
    public void goToStores(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnStoresTab();
    }
    public void goToBeatsAndATVs(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBoatsAndATVsTab();
    }
    public void goToBigCedarLodge(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBigCedarLodgeTab();
    }
//------------Below are the goTo methods for sub-tab Shop-------------------------
    public void goToFishing(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnFishingTab();
    }
    public void goToBoating(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBoating();
    }
    public void goToHunting(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnHunting();
    }
    public void goToShooting(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnShooting();
    }
    public void goToHuntingClothes(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnHuntingClothes();
    }
    public void goToCamping(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCamping();
    }
    public void goToClothing(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnClothing();
    }
    public void goToShoesAndBoats(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnShoesAndBoats();
    }
    public void goToHomeAndGifts(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnHomeAndGifts();
    }
//---------------Below are the goTo methods for Sub-Tab Fishing------------------------
    public void goToFishingReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnFishingReels();
    }
    public void goToBaitcastReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBaitcastReels();
    }
    public void goToSpinningReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSpinningReels();
    }
    public void goToSpincastReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSpincastReels();
    }
    public void goToSaltwaterReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSaltwaterReels();
    }
    public void goToFlyFishingReels(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnFlyFishingReels();
    }

}