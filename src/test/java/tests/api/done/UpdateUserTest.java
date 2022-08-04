package tests.api.done;

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

        UpdateUser user = UsersApi.updateUserPutSuccess(name, job, userId);

        assertEquals(user.getJob(), job);
        assertEquals(user.getName(), name);
    }

    @Test
    public void checkingUpdateUserPatch() {
        int userId = 2;
        String name = "morpheus";
        String job = "zion resident";

        UpdateUser user = UsersApi.updateUserPatchSuccess(name, job, userId);

        assertEquals(user.getJob(), job);
        assertEquals(user.getName(), name);
    }
}
