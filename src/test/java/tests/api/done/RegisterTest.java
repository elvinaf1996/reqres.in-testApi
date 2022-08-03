package tests.api.done;

import api.RegisterApi;
import api.UsersApi;
import api.models.postRegister.PostRegister;
import api.models.postRegister.PostRegisterAnswer;
import api.models.updateUser.UpdateUser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegisterTest {
    @Test
    public void checkingRegister(){
        int id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        PostRegister postRegister = new PostRegister("eve.holt@reqres.in", "pistol");
        PostRegisterAnswer postRegisterAnswer = RegisterApi.postRegisterAnswerSuccess(postRegister);
        assertEquals(postRegisterAnswer.getId(), id);
        assertEquals(postRegisterAnswer.getToken(), token);

    }

    @Test
    public void checkingRegisterFail(){
        String email = "sydney@fife";
        RegisterApi.PostRegisterAnswerFail(email);

    }


}
