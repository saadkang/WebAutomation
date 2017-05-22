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

    public void clickOnCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCoffee().click();
    }
    public void clickOnTea(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTea().click();
    }
    public void clickOnMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMenu().click();
    }
    public void clickOnCoffeHouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCoffeeHouse().click();
    }
    public void clickOnSocialImpact(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSocialImpact().click();
    }
    public void clickOnCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCard().click();
    }
    public void clickOnBlog(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBlog().click();
    }
    public void clickOnShop(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShop().click();
    }
    public void goToCoffee(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCoffee();
    }
    public void goToTea(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnTea();
    }
    public void goToMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnMenu();
    }
    public void goToCoffeeHouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCoffeHouse();
    }
    public void goToSocialImpact(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSocialImpact();
    }
    public void goToCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnCard();
    }
    public void goToBlog(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBlog();
    }
    public void goToShop(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnShop();
    }
}
