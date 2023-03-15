package com.PetStore.request;

import com.PetStore.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PetRequestGet {

    static Response response;

    public static void getPetName_HamcrestMatcher(int statusCode, String name, int id) {
        given().accept(ContentType.JSON)
                .pathParam("id", id)
                .when()
                .get(ConfigurationReader.get("getPet"))
                .then().assertThat()
                .statusCode(statusCode)
                .and().assertThat().contentType("application/json")
                .and().assertThat()
                .body("id", equalTo(id),
                        "name", equalTo(name))
                .log().all();

    }


}
