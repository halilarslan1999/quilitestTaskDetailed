package com.PetStore.stepDef;

import com.PetStore.request.PetRequestGet;
import com.PetStore.request.PetRequestPost;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PetStoreAddPetStepDefs {

    @Given("User creates a POST request with {string} and {string}")
    public void user_creates_a_post_request_with_and(String id, String name) {
        PetRequestPost.postAddNewPet(id,name);
    }

    @Then("Verify that status code should be {int} and body must contains {string} and {int}")
    public void verify_that_status_code_should_be_and_body_must_contains_and(Integer statusCode, String name, int id) {
        PetRequestGet.getPetName_HamcrestMatcher(statusCode, name, id);

    }

}
