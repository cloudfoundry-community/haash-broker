package com.mattstine.cf.haash.haash;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class HaashService {

    private Map<String, Map<Object, Object>> hashMaps = new HashMap<>();

    public void create(String id) {
        hashMaps.put(id, new HashMap<Object, Object>());
    }

    public void delete(String id) {
        hashMaps.remove(id);
    }

}
