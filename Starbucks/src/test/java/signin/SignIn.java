package signin;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import password.Password;
import signinbutton.SignInButton;
import username.Username;
import utility.reporting.ApplicationLog;

/**
 * Created by saadi on 5/26/2017.
 */
public class SignIn extends CommonAPI{

    @Test
    public void signingin() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: SignIn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.clickOnSignIn();
        Username username = PageFactory.initElements(driver, Username.class);
        username.username();
        Password password = PageFactory.initElements(driver, Password.class);
        password.password();
        clickByCss("button.sb-button");
        Thread.sleep(2000);
    }
}
