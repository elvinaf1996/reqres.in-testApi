package api;

import api.models.postRegister.PostRegister;
import api.models.postRegister.PostRegisterAnswer;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.RegisterEndpoints.REGISTER;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.*;

public class RegisterApi {
    public static PostRegisterAnswer postRegisterAnswerSuccess(PostRegister postRegister){
        return given()
                .spec(getRequestSpec())
                .when()
                .body(postRegister)
                .post(REGISTER.getUrl())
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(PostRegisterAnswer.class);
    }

    public static void PostRegisterAnswerFail(String email){
         given()
                .spec(getRequestSpec())
                .when()
                .body(email)
                .post(REGISTER.getUrl())
                .then()
                .spec(getResponseSpec(SC_BAD_REQUEST));
    }

}
