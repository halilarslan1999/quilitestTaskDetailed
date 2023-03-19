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

    public static Map<String, Object> addNewPetBodyWithStatus(String id, String name, String status) {
        Map<String, Object> petInfo = new HashMap<>();
        petInfo.put("id", id);
        petInfo.put("name", name);
        petInfo.put("status", status);
        return petInfo;
    }


}
