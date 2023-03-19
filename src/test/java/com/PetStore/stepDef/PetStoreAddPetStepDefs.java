package com.PetStore.stepDef;

import com.PetStore.request.PetRequestGet;
import com.PetStore.request.PetRequestPost;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static com.PetStore.request.PetRequestPost.postAddNewPetWithPOJO;
import static org.junit.Assert.assertEquals;

public class PetStoreAddPetStepDefs {
    static Response response;

    @Given("User creates a POST request with {string} and {string}")
    public void user_creates_a_post_request_with_and(String id, String name) {
        response=PetRequestPost.postAddNewPet(id, name);
        Integer expectedId = Integer.parseInt(id);
        assertEquals(expectedId, response.path("id"));
        assertEquals(name,response.path("name"));

        response.prettyPrint();
    }

    @Then("Verify that status code should be {int} and body must contains {string} and {int}")
    public void verify_that_status_code_should_be_and_body_must_contains_and(Integer statusCode, String name, int id) {
        PetRequestGet.getPetName_HamcrestMatcher(statusCode, name, id);


    }

    @Given("User creates a POST request with {string} and {string} and {string}")
    public void user_creates_a_post_request_with_and_and(String petId, String name, String status) {
        response = PetRequestPost.postAddNewPetWithStatus(petId, name, status);
    }

    @Then("Then Verify that status code should be {int}")
    public void thenVerifyThatStatusCodeShouldBe(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.statusCode());
    }

    @And("Then verify that status code is {int}")
    public void thenVerifyThatStatusCodeIs(int statusCode) {

        assertEquals(statusCode, response.statusCode());
    }

    @Then("Verify that if body contains {string} and {string} and {string}")
    public void verify_that_if_body_contains_and_and(String id, String name, String status) {
        response = PetRequestGet.getPetNameMethod2(id);

        Integer expectedId = Integer.parseInt(id);
        assertEquals(expectedId, response.path("id"));
        assertEquals(name, response.path("name"));
        assertEquals(status, response.path("status"));
    }

    @Then("Verify with JsonPath that if body contains {string} and {string} and {string}")
    public void verifyWithJsonPathThatIfBodyContainsAndAnd(String id, String name, String status) {
        response = PetRequestGet.getPetNameMethod2(id);
        JsonPath jsonPath = response.jsonPath();
        assertEquals(id, jsonPath.getString("id"));
        assertEquals(name, jsonPath.getString("name"));
        assertEquals(status, jsonPath.getString("status"));

    }

    @Given("Create a POST request with {int} and {string}")
    public void create_a_post_request_with_and(Integer id, String name) {
       response= postAddNewPetWithPOJO(id, name);



    }
    @Given("Verify the status code")
    public void verify_the_status_code() {
        assertEquals(200, response.statusCode());

    }

    @Then("Verify that body contains {string} and {string}")
    public void verify_that_body_contains_and(String id, String name) {

        response = PetRequestGet.getPetNameMethod2(id);
        JsonPath jsonPath = response.jsonPath();
        assertEquals(200, response.statusCode());

        assertEquals(id, jsonPath.getString("id"));
        assertEquals(name, jsonPath.getString("name"));

    }
}