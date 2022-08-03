package tests.api;

import api.UsersApi;
import api.models.updateUser.UpdateUser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpdateUserTest {
    @Test
    public void checkingUpdateUserPut() {
        int userId = 2;
        String name = "morpheus";
        String job = "zion resident";
        UpdateUser updateUser = new UpdateUser(name,job);

        UpdateUser user = UsersApi.updateUserPutSuccess(updateUser, userId);

        assertEquals(user.getJob(), job);
        assertEquals(user.getName(), name);
    }

    @Test
    public void checkingUpdateUserPatch() {
        int userId = 2;
        String name = "morpheus";
        String job = "zion resident";
        UpdateUser updateUser = new UpdateUser(name,job);

        UpdateUser user = UsersApi.updateUserPatchSuccess(updateUser, userId);

        assertEquals(user.getJob(), job);
        assertEquals(user.getName(), name);
    }
}
