package clickontabs;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by saadi on 5/16/2017.
 */
public class ClickOnTabs extends CommonAPI{

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_coffee a.tab strong:nth-child(1)")
    public static WebElement Coffee;

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_menudrinkstea a.tab strong:nth-child(1)")
    public static WebElement Tea;

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_menu a.tab strong:nth-child(1)")
    public static WebElement Menu;

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_coffeehouse a.tab strong:nth-child(1)")
    public static WebElement CoffeeHouse;

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_responsibility a.tab strong:nth-child(1)")
    public static WebElement SocialImpact;

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_card a.tab strong:nth-child(1)")
    public static WebElement Card;

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_blog a.tab strong:nth-child(1)")
    public static WebElement Blog;

    @FindBy(how = How.CSS, using = ".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_shop a.tab strong:nth-child(1)")
    public static WebElement Shop;

    public static WebElement getCoffee() {
        return Coffee;
    }

    public static WebElement getTea() {
        return Tea;
    }

    public static WebElement getMenu() {
        return Menu;
    }

    public static WebElement getCoffeeHouse() {
        return CoffeeHouse;
    }

    public static WebElement getSocialImpact() {
        return SocialImpact;
    }

    public static WebElement getCard() {
        return Card;
    }

    public static WebElement getBlog() {
        return Blog;
    }

    public static WebElement getShop() {
        return Shop;
    }

    public void seeCoffeeOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCoffee().click();
    }
    public void seeTeaOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTea().click();
    }
    public void seeMenuOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
    }
    public void seeCoffeHouseOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCoffeeHouse().click();
    }
    public void seeSocialImpactOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSocialImpact().click();
    }
    public void seeCardOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCard().click();
    }
    public void seeBlogOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBlog().click();
    }
    public void seeShopOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShop().click();
    }
    public void clickOnCoffeeTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCoffeeOptions();
    }
    public void clickOnTeaTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeTeaOptions();
    }
    public void clickOnMenuTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeMenuOptions();
    }
    public void clickOnCoffeeHouseTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCoffeHouseOptions();
    }
    public void clickOnSocialImpactTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeSocialImpactOptions();
    }
    public void clickOnCardTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeCardOptions();
    }
    public void clickOnBlogTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeBlogOptions();
    }
    public void clickOnShopTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeShopOptions();
    }
}
