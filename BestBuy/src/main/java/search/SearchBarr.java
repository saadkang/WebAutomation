package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by saadi on 6/15/2017.
 */
public class SearchBarr extends CommonAPI{

    @FindBy(how = How.CSS, using = ".header-search-button")
    public static WebElement searchButton;

    public static WebElement getSearchButton() {
        return searchButton;
    }
    public void clickOnSearchButton() {
        getSearchButton().click();
    }
    public void goToSearchButton(){
        clickOnSearchButton();
    }
    public void goToSearchBar(){
        typeByCss("#gh-search-input", "laptops");
        goToSearchButton();
    }
}
