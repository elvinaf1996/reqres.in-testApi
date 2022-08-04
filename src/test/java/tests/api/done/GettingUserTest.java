package tests.api.done;

import api.Support;
import api.UsersApi;
import api.models.getUser.GetUser;
import api.models.getUser.GetUsers;
import api.models.getUser.UserData;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GettingUserTest {

    String url = "https://reqres.in/#support-heading";
    String text = "To keep ReqRes free, contributions towards server costs are appreciated!";
    Support support = new Support(url,text);

    @Test
    public void checkingGetUser() {
        int userId = 2;
        String email = "janet.weaver@reqres.in";
        String firstName = "Janet";
        String lastName = "Weaver";
        String avatar = "https://reqres.in/img/faces/2-image.jpg";

        GetUser user = UsersApi.getUserSuccess(userId);

        assertEquals(user.getData().getAvatar(), avatar);
        assertEquals(user.getData().getEmail(), email);
        assertEquals(user.getData().getId(), userId);
        assertEquals(user.getData().getFirstName(), firstName);
        assertEquals(user.getData().getLastName(), lastName);
        assertEquals(user.getSupport(), support);
    }

    @Test
    public void checkingGetUserFail() {
        int userId = 23;
        UsersApi.getUserFail(userId);
    }

    @Test
    public void checkingGetUsers(){
        int page = 2;
        int perPage = 6;
        int total = 12;
        int totalPages = 2;
        ArrayList <UserData> userData = new ArrayList<> ();
        userData.add(new UserData(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg"));
        userData.add(new UserData(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg"));
        userData.add(new UserData(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg"));
        userData.add(new UserData(10, "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/10-image.jpg"));
        userData.add(new UserData(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg"));
        userData.add(new UserData(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg"));

        GetUsers getUsers = UsersApi.getUsersSuccess(page);
        assertEquals(getUsers.getPage(), page);
        assertEquals(getUsers.getPerPage(), perPage);
        assertEquals(getUsers.getTotal(), total);
        assertEquals(getUsers.getTotalPages(), totalPages);
        assertEquals(getUsers.getData(), userData);
        assertEquals(getUsers.getSupport(), support);

    }

}

