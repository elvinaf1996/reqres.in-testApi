package tests.api.done;

import api.LoginApi;
import api.models.postLogin.PostLogin;
import api.models.postLogin.PostLoginAnswer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void checkingLogin(){
        String email = "eve.holt@reqres.in";
        String password = "cityslicka";
        String token = "QpwL5tke4Pnpja7X4";
        PostLogin postLogin = new PostLogin(email, password);
        PostLoginAnswer postLoginAnswer = LoginApi.postLoginAnswerSuccess(postLogin);
        assertEquals(postLoginAnswer.getToken(), token);
    }

    @Test
    public void checkingLoginFail(){
        String email = "peter@klaven";
        LoginApi.postLoginAnswerFail(email);
    }
}
