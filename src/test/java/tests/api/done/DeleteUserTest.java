package tests.api.done;

import api.ResourceApi;
import api.UsersApi;
import org.junit.Test;

public class DeleteUserTest {
    @Test
    public void checkingDeleteUser() {
        int UserId = 2;
        UsersApi.deleteUserPatchSuccess(2);
    }
}
