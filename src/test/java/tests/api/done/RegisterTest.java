package tests.api.done;

import api.RegisterApi;
import api.models.postRegister.PostRegister;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegisterTest {
    @Test
    public void checkingRegister(){
        int id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        String email = "eve.holt@reqres.in";
        String password = "pistol";
        PostRegister postRegister = RegisterApi.postRegisterSuccess(email, password);
        assertEquals(postRegister.getId(), id);
        assertEquals(postRegister.getToken(), token);

    }

    @Test
    public void checkingRegisterFail(){
        String email = "sydney@fife";
        RegisterApi.PostRegisterFail(email);

    }


}
