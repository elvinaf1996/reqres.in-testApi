package api;

import api.models.postRegister.PostRegister;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.RegisterEndpoints.REGISTER;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.*;

public class RegisterApi {
    public static PostRegister postRegisterSuccess(String email, String password){
        return given()
                .spec(getRequestSpec())
                .when()
                .body(String.format("{\"email\": \"%s\", \"password\": \"%s\"}",email, password))
                .post(REGISTER.getUrl())
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(PostRegister.class);
    }

    public static void PostRegisterFail(String email){
         given()
                .spec(getRequestSpec())
                .when()
                .body(email)
                .post(REGISTER.getUrl())
                .then()
                .spec(getResponseSpec(SC_BAD_REQUEST));
    }

}
