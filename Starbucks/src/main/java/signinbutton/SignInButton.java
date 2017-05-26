package signinbutton;

import base.CommonAPI;

/**
 * Created by saadi on 5/26/2017.
 */
public class SignInButton extends CommonAPI{

    public void signIn(){
        clickByCss("button[type='submit']");
    }
}
