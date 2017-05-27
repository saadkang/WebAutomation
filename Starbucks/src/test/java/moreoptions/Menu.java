package moreoptions;

import base.CommonAPI;
import clickontabs.MenuTab;
import clickontabs.frapp.Frapp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by saadi on 5/27/2017.
 */
public class Menu extends CommonAPI{

    @Test
    public void menu() throws InterruptedException {
        MenuTab menuTab = PageFactory.initElements(driver, MenuTab.class);
        menuTab.menu();
        Frapp frapp = PageFactory.initElements(driver, Frapp.class);
        frapp.goToFrappBlend();
        frapp.goToSmoreFrapp();
    }
}
