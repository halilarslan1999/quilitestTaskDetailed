package com.PetStore.dataForApi;

import java.util.HashMap;
import java.util.Map;

public class DataApi {

    public static Map<String, Object> addNewPetBody(String id, String name) {
        Map<String, Object> petName = new HashMap<>();
        petName.put("id", id);
        petName.put("name", name);
        return petName;
    }

}
