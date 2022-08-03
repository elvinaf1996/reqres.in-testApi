package tests.api;

import api.UsersApi;
import api.models.createUser.CreateUser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatingUserTest {

    @Test
    public void checkingCreateUser() {
        String name = "morpheus";
        String job = "leader";

        CreateUser actualCreateUser = UsersApi.createUserSuccess(name, job);

        assertEquals(actualCreateUser.getName(), name);
        assertEquals(actualCreateUser.getJob(), job);
    }

}
