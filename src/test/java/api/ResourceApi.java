package api;

import api.models.getResourse.GetResource;
import api.models.getResourse.GetResources;
import api.models.getUser.GetUser;
import io.restassured.http.ContentType;

import static api.SpecHelper.getRequestSpec;
import static api.SpecHelper.getResponseSpec;
import static api.endpoints.ResourceEndpoints.RESOURCE;
import static api.endpoints.ResourceEndpoints.RESOURCES;
import static api.endpoints.UsersEndpoints.USER;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.apache.http.HttpStatus.SC_OK;

public class ResourceApi {
    public static GetResource getResourceSuccess(int resourceId) {
        return given()
                .spec(getRequestSpec())
                .when()
                .get(String.format(RESOURCE.getUrl(), resourceId))
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(GetResource.class);
    }
    public static GetResources getResourcesSuccess() {
        return given()
                .spec(getRequestSpec())
                .when()
                .get(String.format(RESOURCES.getUrl()))
                .then()
                .spec(getResponseSpec(SC_OK))
                .extract()
                .as(GetResources.class);
    }
    public static void getResourceFail(int resourceId) {
        given()
                .spec(getRequestSpec())
                .when()
                .get(String.format(RESOURCE.getUrl(), resourceId))
                .then()
                .spec(getResponseSpec(SC_NOT_FOUND));
    }


}
