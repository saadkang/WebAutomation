package news;

import base.CommonAPI;
import log.NYPLog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class News extends CommonAPI {

    @Test
    public void headlineNews(){
        NYPLog.epicLogger("Epic: News EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-1> GREEN-1 </a>");
        NewsPage newsPage = PageFactory.initElements(driver, NewsPage.class);
        newsPage.clickOnHeadLine();
    }
}
