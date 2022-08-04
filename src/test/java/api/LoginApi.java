package api;

import api.models.postLogin.PostLogin;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.LoginEndpoints.LOGIN;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.*;

public class LoginApi {

    public static PostLogin postLoginAnswerSuccess(String email, String password){
        return given()
                .spec(getRequestSpec())
                .when()
                .body(String.format("{\"email\": \"%s\", \"password\": \"%s\"}",email, password))
                .post(LOGIN.getUrl())
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(PostLogin.class);
    }

    public static void  postLoginAnswerFail(String email){
        given()
                .spec(getRequestSpec())
                .when()
                .body(email)
                .post(LOGIN.getUrl())
                .then()
                .spec(getResponseSpec(SC_BAD_REQUEST));
    }

}
