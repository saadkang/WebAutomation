package searchbar;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.SearchBarr;

/**
 * Created by saadi on 6/15/2017.
 */
public class SearchBar extends CommonAPI{

    @Test
    public void searchBarPage(){
        SearchBarr searchBarr = PageFactory.initElements(driver, SearchBarr.class);
        searchBarr.goToSearchBar();
    }
}
