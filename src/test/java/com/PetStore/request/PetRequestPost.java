package com.PetStore.request;

import com.PetStore.dataForApi.AddNewPetPoJoApi;
import com.PetStore.dataForApi.DataApi;
import com.PetStore.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;


import static io.restassured.RestAssured.given;

public class PetRequestPost {

    static Response response;

    public static Response postAddNewPet(String id, String name) {

        response = given().log().all().contentType(ContentType.JSON)
                .and()
                .body(DataApi.addNewPetBody(id, name))
                .and()
                .post(ConfigurationReader.get("postPet"));
        assertEquals(200, response.statusCode());
        return response;

    }

    public static Response postAddNewPetWithStatus(String id, String name, String status) {

        response = given().contentType(ContentType.JSON)
                .and()
                .body(DataApi.addNewPetBodyWithStatus(id, name, status))
                .and()
                .post(ConfigurationReader.get("postPet"));
        response.prettyPrint();

        return response;

    }

    public static Response postAddNewPetWithPOJO(Integer id, String name) {

        AddNewPetPoJoApi addNewPetPoJoApi=new AddNewPetPoJoApi();

        addNewPetPoJoApi.setId(id);
        addNewPetPoJoApi.setName(name);

        response = given().contentType(ContentType.JSON)
                .and()
                .body(addNewPetPoJoApi)
                .and()
                .post(ConfigurationReader.get("postPet"));

        response.prettyPrint();


        return response;

    }


}
