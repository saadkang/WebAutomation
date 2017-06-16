package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by saadi on 6/15/2017.
 */
public class SearchBarr extends CommonAPI{

    @FindBy(how = How.CSS, using = "#gh-search-input")
    public static WebElement searchBar;

    public static WebElement getSearchBar() {
        return searchBar;
    }
    public void clickOnSearchBar() {
        getSearchBar().click();
    }
    public void goToSearchBar(){
        typeByCssNEnter("#gh-search-input", "laptops");
    }
}
