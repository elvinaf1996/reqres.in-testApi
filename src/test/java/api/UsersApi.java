package api;

import api.models.createUser.CreateUser;
import api.models.getUser.GetUser;
import api.models.getUser.GetUsers;
import api.models.updateUser.UpdateUser;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.UsersEndpoints.*;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.*;

public class UsersApi {

    public static GetUser getUserSuccess(int userId) {
        return given()
                .spec(getRequestSpec())
                .when()
                .get(String.format(USER.getUrl(), userId))
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(GetUser.class);
    }

    public static void getUserFail(int userId) {
        given()
                .spec(getRequestSpec())
                .when()
                .get(String.format(USER.getUrl(), userId))
                .then()
                .spec(getResponseSpec(SC_NOT_FOUND));
    }

    public static CreateUser createUserSuccess(String name, String job) {
        return given()
                .spec(getRequestSpec())
                .body(String.format("{\"name\": \"%s\", \"job\": \"%s\"}", name, job))
                .when()
                .post(USERS.getUrl())
                .then()
                .spec(getResponseSpec(SC_CREATED))
                .extract()
                .as(CreateUser.class);
    }


    public static GetUsers getUsersSuccess(int pageNumber){
        return given()
                .spec(getRequestSpec())
                .when()
                .queryParam("page", pageNumber)
                .get(USERS.getUrl())
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(GetUsers.class);
    }

    public static UpdateUser updateUserPutSuccess(UpdateUser updateUserData, int userId) {
        return given()
                .spec(getRequestSpec())
                .when()
                .body(updateUserData)
                .put(USER.getUrl(), userId)
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(UpdateUser.class);
    }

    public static UpdateUser updateUserPatchSuccess(UpdateUser updateUserData, int userId) {
        return given()
                .spec(getRequestSpec())
                .when()
                .body(updateUserData)
                .patch(USER.getUrl(), userId)
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(UpdateUser.class);
    }

    public static void deleteUserPatchSuccess(int userId){
        given()
                .spec(getRequestSpec())
                .when()
                .delete(String.format(USER.getUrl(), userId))
                .then()
                .spec(getResponseSpec(204));

    }



}
