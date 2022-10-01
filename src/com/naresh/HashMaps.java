package com.naresh;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String,String> city = new HashMap<>();
        city.put("England"," London");
        city.put("Japan","Tokiyo");
        city.put("Germany","Berlin");
        city.put("Norway","Oslo");
        System.out.println(city);

    }
}
