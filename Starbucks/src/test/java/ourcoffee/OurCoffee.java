package ourcoffee;

import base.CommonAPI;
import coffeepage.OurCoffeePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/16/2017.
 */
public class OurCoffee extends CommonAPI {

@Test(enabled = false) //This test is working and doing the hover over the coffee tab.
    public void CoffeePage(){
    ApplicationLog.epicLogger("Epic: OurCoffee AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-14> GREEN-14 </a>");
    OurCoffeePage ourCoffeePage = PageFactory.initElements(driver, OurCoffeePage.class);
    ourCoffeePage.OurCoffeeLaunch();
 }
 @Test
    public void CoffeeTest(){
        mouseHoverByCSS(".header_container .container .grid .column.size12of12 #header #nav .nav_menu li#nav_coffee a.tab strong:nth-child(1)");
 }
}