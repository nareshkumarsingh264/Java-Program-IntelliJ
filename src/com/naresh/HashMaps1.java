package com.naresh;

import java.util.HashMap;
import java.util.Map;
public class HashMaps1 {
    public static void main(String[] args) {
        Map<String,String> city = new HashMap<>();

        city.put("Utter Pradesh","Lucknow");
        city.put("Rajasthan","Jaipur");
        city.put("Goa","Panji");
        city.put("Madhya Pradesh","Bhopal");
        System.out.println(city);
        //get element
        System.out.println(city.get("Utter Pradesh"));
    }
}
