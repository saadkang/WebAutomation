package moreoptions;

import base.CommonAPI;
import clickontabs.CardTab;
import clickontabs.reloadcard.ReloadCard;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import password.Password;
import username.Username;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/27/2017.
 */
public class Card extends CommonAPI {

    @Test
    public void card() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: ReloadCard AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        CardTab cardTab = PageFactory.initElements(driver, CardTab.class);
        cardTab.card();
        ReloadCard reloadCard = PageFactory.initElements(driver, ReloadCard.class);
        reloadCard.goToReloadCard();
        Username username = PageFactory.initElements(driver, Username.class);
        username.username();
        Password password = PageFactory.initElements(driver, Password.class);
        password.password();
        clickByCss("button.sb-button");
    }
}