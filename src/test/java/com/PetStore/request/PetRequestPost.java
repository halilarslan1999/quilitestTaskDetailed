package com.PetStore.request;

import com.PetStore.dataForApi.DataApi;
import com.PetStore.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetRequestPost {

    static Response response;



    public static Response postAddNewPet(String id, String name) {

        response = given().log().all().contentType(ContentType.JSON)
                .and()
                .body(DataApi.addNewPetBody(id, name))
                .and()
                .post(ConfigurationReader.get("postPet"));
        response.prettyPrint();

        return response;

    }

}
