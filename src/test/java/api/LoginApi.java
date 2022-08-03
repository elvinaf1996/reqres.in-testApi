package api;

import api.models.postLogin.PostLogin;
import api.models.postLogin.PostLoginAnswer;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.LoginEndpoints.LOGIN;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.*;

public class LoginApi {

    public static PostLoginAnswer postLoginAnswerSuccess(PostLogin postLogin){
        return given()
                .spec(getRequestSpec())
                .when()
                .body(postLogin)
                .post(LOGIN.getUrl())
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(PostLoginAnswer.class);
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
